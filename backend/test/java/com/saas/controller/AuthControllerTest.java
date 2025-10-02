package com.saas.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthControllerTest {

    @Test
    void testLoginEndpoint() {
        RestAssured.given()
            .baseUri("http://localhost:8080")
            .when()
            .post("/auth/login")
            .then()
            .statusCode(200);
    }
    @Test
    void contextLoads() {
         // Just verifies Spring context loads successfully
    }

}
