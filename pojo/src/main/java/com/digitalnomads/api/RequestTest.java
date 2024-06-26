//package com.digitalnomads.api;
//
//import io.restassured.http.ContentType;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static io.restassured.RestAssured.given;
//
//public class RequestTest {
//    private final static String URL = "https://reqres.in";
//
//    @Test
//    public void checkAvatarAndIdTest() {
//        List<UserData> users = given()
//                .when()
//                .contentType(ContentType.JSON)
//                .get(URL + "/api/users?page=2")
//                .then().log().all()
//                .extract().body().jsonPath().getList("data", UserData.class);
//        users.forEach(x-> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
//        Assert.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));
//
//        List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
////        List<String> ids = users.stream().map(x->x.getId()).toString().collect(Collectors.toList());
//    }
//}
