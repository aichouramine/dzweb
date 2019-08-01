package controllers;

import java.util.HashMap;

import com.fasterxml.jackson.databind.JsonNode;

import models.Event;
import models.EventV2;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import utils.JWTUtils;

public class JSONController extends Controller {

	public Result usingMap() {
		HashMap<String, Object> result = new HashMap<String, Object>() {
			{
				put("name", "LavaOne 2018");
				put("track", "Unique");
				put("talk", "Restful Services with Play Framework");
				put("schedule", "Monday 15, 15:00 to 16:00");
			}
		};
		return ok(Json.toJson(result));
	}

	public Result returnObj() {
		Event event = new Event("LavaOne 2018", 15);
		return ok(Json.toJson(event));
	}

	public Result catchObj(Http.Request request) {
		JsonNode jsonNode = request.body().asJson();
		System.out.println(jsonNode.toString());
		Event event = Json.fromJson(jsonNode, Event.class);
		return ok(Json.toJson(event));
	}

	public Result returnToken() {
		EventV2 event = new EventV2("CodeMash 2.0.1.8", "Web/Front-End", "Restful Services with Play Framework",
				"Thursday 11, 8:00 to 9:00");
		return ok(JWTUtils.generateJWT(event));
	}

	public Result validateToken(Http.Request request) {
		String token = request.body().asText();
		return ok("Is a valid token: " + JWTUtils.validateJWT(token));
	}

}
