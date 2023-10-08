package com.digitalnomads.api.api.demo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class GoRestUSerTest {
    public static void main(String[] args) {

        String userPayload ="  {\n" +
                "        \"name\": \" Baydan\",\n" +
                "        \"email\": \"donaldtramp1@gmail.com\",\n" +
                "        \"gender\": \"male\",\n" +
                "        \"status\": \"active\"\n" +
                "    }";

        RequestSpecification requestSpecification =
                given()
                        .baseUri("https://gorest.co.in/public/v2")
                        .header("Authorization","Bearer ac867018519ad5a5da4d48d08d3ce2fe3a8c5ca8b3035d27191e2aa9438854f5")
                        .contentType(ContentType.JSON)
                        .accept(ContentType.JSON)
                        .body(userPayload);

        Response response = requestSpecification
                .request("POST","users");
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),201);
    }
}
