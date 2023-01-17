package mass;

import static io.restassured.RestAssured.baseURI;

import org.json.simple.JSONObject;

import Massas.Main;
import metodos.Metodos;

public class MassMap {
	Main map = new Main();

	@SuppressWarnings("unchecked")
	public static String CreateBoard() {
		JSONObject json = new JSONObject();
		json.put("name", "Board 01");
		json.put("key", "25457a572e044cb6c87590a29102b6a7");
		json.put("token", "735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa");
		return json.toJSONString();
	}

	@SuppressWarnings("unchecked")
	public static String CreateList() {
		String idBoard = Metodos.getResponse("id");
		JSONObject json = new JSONObject();
		json.put("idBoard", idBoard);
		json.put("name", "List 01");
		json.put("key", "25457a572e044cb6c87590a29102b6a7");
		json.put("token", "735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa");
		return json.toJSONString();
	}

	@SuppressWarnings("unchecked")
	public static String CreateCard() {
		String idList = Metodos.getResponse("id");
		JSONObject json = new JSONObject();
		json.put("idList", idList);
		json.put("name", "Card 01");
		json.put("key", "25457a572e044cb6c87590a29102b6a7");
		json.put("token", "735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa");
		return json.toJSONString();
	}

	@SuppressWarnings("unchecked")
	public static String updateCard() {
		JSONObject json = new JSONObject();
		json.put("key", "25457a572e044cb6c87590a29102b6a7");
		json.put("token", "735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa");
		json.put("name", "👋 What? Why? How?");
		json.put("pos", "65535");
		json.put("shortLink", "H0TZyzbK");
		json.put("shortUrl", "https://trello.com/c/H0TZyzbK");
		json.put("subscribed", "false");
		json.put("url", "https://trello.com/c/H0TZyzbK/4-%F0%9F%91%8B-what-why-how");
		return json.toJSONString();
	}

	
	
	@SuppressWarnings("unchecked")
	public static String DeliteBoard() {
	    String  id = Metodos.getResponse("idBoard");
		JSONObject json = new JSONObject();
		json.put("idBoard", id);
		json.put("key", "25457a572e044cb6c87590a29102b6a7");
		json.put("token", "735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa");
		return json.toJSONString();
	}

	public static String uri() {
		return baseURI = "https://api.trello.com/1/";
	}

	public static String setBaseUri() {
		return baseURI = "https://api.trello.com/1";
	}

}
