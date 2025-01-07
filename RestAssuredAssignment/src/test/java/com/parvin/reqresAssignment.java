package com.parvin;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
public class reqresAssignment {
    @BeforeTest
    public void setup(){

        baseURI = "https://reqres.in/api";
    }
    @Test
    public void listUserTest(){
        given()
                .get("users?page=2")
                .then()
                .statusCode(200);
    }
    @Test
    public void singleUserTest(){
        given()
                .get("users/2")
                .then()
                .statusCode(200);
    }
    @Test
    public void singleUserNotFoundTest(){
        given()
                .get("users/23")
                .then()
                .statusCode(404);
    }
    @Test
    public void listResourceTest(){
        given()
                .get("unknown")
                .then()
                .statusCode(200);
    }
    @Test
    public void singleResourceTest(){
        given()
                .get("unknown/2")
                .then()
                .statusCode(200);
    }
    @Test
    public void singleResourceNotFoundTest(){
        given()
                .get("unknown/23")
                .then()
                .statusCode(404);
    }
    @Test
    public void create(){
        JSONObject userData = new JSONObject();
        userData.put("name","morpheus");
        userData.put("job","leader");
        given()
                .header("content-Type","application/json")
                .body(userData.toJSONString())
                .post("users")
                .then()
                .statusCode(201)
                .body("name",equalTo("morpheus"))
                .body("job",equalTo("leader"));

    }
    @Test
    public void UpdatePutTest(){
        given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}")
                .put("users/2")
                .then()
                .statusCode(200)
                .body("job",equalTo("zion resident"));
    }
    @Test
    public void updatePatchTest(){
        given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}")
                .patch("users/2")
                .then()
                .statusCode(200)
                .body("name",equalTo("morpheus"))
                .body("job",equalTo("zion resident"));
    }
    @Test
    public void delete(){
        given()
                .delete("users/2")
                .then()
                .statusCode(204);

    }
    @Test
    public void registerSuccessfulTest(){
        given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"pistol\"\n" +
                        "}")
                .post("register")
                .then()
                .statusCode(200)
                .log().all();


    }
    @Test
    public void registerUnsuccessfulTest(){
        given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"email\": \"sydney@fife\"\n" +
                        "}")
                .post("register")
                .then()
                .statusCode(400);


    }
    @Test
    public void loginSuccessfulTest(){
        given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                .post("login")
                .then()
                .statusCode(200);


    }
    @Test
    public void loginUnsuccessfulTest(){
        given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"email\": \"peter@klaven\"\n" +
                        "}")
                .post("login")
                .then()
                .statusCode(400);

    }
    @Test
    public void delayedResponseTest(){
        given()
                .get("users?delay=3")
                .then()
                .statusCode(200);


    }


}
