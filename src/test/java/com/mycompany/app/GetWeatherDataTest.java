package com.mycompany.app;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import openweatherapi.GetWeatherData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.*;
import org.junit.rules.TestName;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetWeatherDataTest {

    private static final Logger logger = LogManager.getLogger(GetWeatherDataTest.class);
    @Rule public TestName name = new TestName();

    @Ignore
    @Test()
    public void getWeatherTest(){
        String actualValue =  GetWeatherData.getWeatherData();
        Assert.assertEquals("stations",actualValue);
        logger.info("Test Passed");
    }

    @Test
    public void statusTest() {
        String url = "https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=87af3508c443016e851bee3ba091fd3c";
        given()
                .contentType(ContentType.JSON)
                //.pathParam("id", "AskJsd8Sd")
                .when()
                .get(url)
                .then()
                .statusCode(200);

        // given().contentType(ContentType.JSON).when().get(url).then().statusCode(200).body("base", equalTo("stations")).body("coord.lon", equalTo(10.99F));
        //requestSpecification.contentType(ContentType.JSON).
        String testMethodName = name.getMethodName();
        logger.info( testMethodName + ": Test Passed");
    }

    @Test
    public void baseTest() {
        String url = "https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=87af3508c443016e851bee3ba091fd3c";
        given()
                .contentType(ContentType.JSON)
                //.pathParam("id", "AskJsd8Sd")
                .when()
                .get(url)
                .then()
                .body("base", equalTo("stations")); //.body("coord.lon", equalTo(10.99F))

        logger.info( name.getMethodName() + ": Test Passed");
    }

    @Test
    public void latitudeTest() {
        String url = "https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=87af3508c443016e851bee3ba091fd3c";
        given()
                .contentType(ContentType.JSON)
                //.pathParam("id", "AskJsd8Sd")
                .when()
                .get(url)
                .then()
                .body("coord.lon", equalTo(10.99F)); //.body("coord.lon", equalTo(10.99F))
        logger.info( name.getMethodName() + ": Test Passed");
    }
}
