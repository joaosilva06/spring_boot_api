package com.example.cicdtest;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CicdTestApplicationTest {

    @Test
    public void deveRetornarCodSucesso(){
        RestAssured.given()
                .when()
                    .get("http://localhost:8085/")
                .then()
                    .statusCode(200);

    }
}
