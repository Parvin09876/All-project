package com.parvin.ApiTesting;

import static io.restassured.response.Response.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Example2 {
    @Test
    public void test2(){
      get("https://reqres.in/api/users?page=2")
              .then()
              .statusCode(200)
              .body("data[1].id",equalTo(8))
              .body("data.first_name",hasItem("Byron"));

    }
    @Test
    public void createUserTest(){
        JSONObject userData= new JSONObject ();
        userData.put("name","my name");
        userData.put("job","student");
        baseURI="https://reqres.in/api";
        given()
                .header("Content-Type", "application/json")
                .body(userData.toJSONString())
                .post("users")
                .then()
                .statusCode(201)
                .body("name", equalTo("my name"));


    }
}
