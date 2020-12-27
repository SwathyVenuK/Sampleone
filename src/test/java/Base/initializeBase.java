package Base;

import Utils.utils;

import static io.restassured.RestAssured.given;

public class initializeBase {
    public static void getMethod(){

        given().baseUri(utils.URL()).log().all()
                .get("/api/users/2").then().log().all();

    }

    public static void getQueryMethod() {
        given().baseUri(utils.URL()).log().all().queryParam("page", "2")
                .get("/api/users/").then().log().all();

    }

    public static void postMethod() {
        given().baseUri(utils.URL()).log().all()

                .body(utils.addBody("TeamB", "Intern"))
                .post("/api/users/").then().log().all();

    }
}
