package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiClient {

    public Response getRequest(
            String endpoint,
            String token) {

        return RestAssured
                .given()
                .header("x-auth-token", token)
                .when()
                .get(endpoint);
    }

    public Response deleteRequest(
            String endpoint,
            String token) {

        return RestAssured
                .given()
                .header("x-auth-token", token)
                .when()
                .delete(endpoint);
    }
}