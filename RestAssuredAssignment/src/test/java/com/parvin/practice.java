package com.parvin;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class practice {
@Test
    public void test(){
    JSONObject userData = new JSONObject();
    baseURI="https://reqres.in/api";
    userData.put("name","morpheus");
    userData.put("job","student");
    given()
            .header("Content-Type","application/json")
            .body(userData.toJSONString())
            .post("users")
            .then()
            .statusCode(201)
            .body("name",equalTo("morpheus"));
}
}
