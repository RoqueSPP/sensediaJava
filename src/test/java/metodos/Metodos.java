package metodos;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Metodos {

	static Response response;

	public static void postMain(String uri, String endpoint, String body) {
		response = 
				given().contentType(ContentType.JSON)
				.body(body)
				.when().post(uri + endpoint)
				.then()
				.log().all()
				.extract()
				.response();

	}

	public static void putCard(String uri, String endpoint, String body) {
		response = given().headers("Content-Type","Application/json")
				.body(body)
				.when().put(uri + endpoint)
				.then().log().all()
				.extract()
				.response();

	}

	public static void DeliteBoard(String uri, String endpoint, String body) {
		response = given().contentType(ContentType.JSON)
				.body(body)
				.when().delete(uri + endpoint)
				.then().log().all()
				.extract()
				.response();

	}

	public static String getResponse(String key) {

		return response.getBody().jsonPath().getString(key);

	}

	public static void validaStatusCode(int status) {
		assertEquals(status, response.getStatusCode());
		System.out.println(response.getStatusCode());
	}

	public static void getStatusCode() {
		System.out.println(response.getStatusCode());

	}

	public static void getBody() {
		System.out.println(response.getBody().asString());
	}

}