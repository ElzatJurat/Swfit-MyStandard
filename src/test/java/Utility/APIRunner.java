package Utility;

import APIModels.CustomResponse;
import APIModels.RequestBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;

public class APIRunner {

    private static CustomResponse cr;
    private static int status;
    private static String json;

    public static void runGet(String uri){
        Response response = RestAssured.get(uri);
        status = response.statusCode();
        json = response.asString();
        System.out.println("STATUS: " + response.statusCode());
        System.out.println(response.asString());
        ObjectMapper mapper = new ObjectMapper();
        try {
            cr = mapper.readValue(response.asString(), CustomResponse.class);
        } catch (IOException e) {
            System.out.println("JSON COULDN'T BE MAPPED");
        }

    }

    public static void runPost(RequestBody body, String uri){
        Response response = RestAssured.given().contentType(ContentType.JSON).body(body).when().post(uri);
        status = response.statusCode();
        json = response.asString();
        System.out.println("STATUS: " + response.statusCode());
        System.out.println(response.asString());
        ObjectMapper mapper = new ObjectMapper();
        try {
            cr = mapper.readValue(response.asString(), CustomResponse.class);
        } catch (IOException e) {
            System.out.println("JSON COULDN'T BE MAPPED");
        }
    }

    public static CustomResponse getResponse(){
        if(cr == null){
            System.out.println("Please run API first");
            throw new RuntimeException();
        }
        return cr;
    }

    public static int getStatus() {
        return status;
    }

    public static void setStatus(int status) {
        APIRunner.status = status;
    }

    public static String getJson() {
        return json;
    }

    public static void setJson(String json) {
        APIRunner.json = json;
    }
}
