package controllers;

import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.Student;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import repositories.StudentStore;
import utils.Util;

public class StudentController extends Controller {

	public Result create(Http.Request request) {
		JsonNode json = request.body().asJson();
		if (json == null) {
			return badRequest(Util.createResponse("Expecting Json data", false));
		}
		Student student = StudentStore.getInstance().addStudent(Json.fromJson(json, Student.class));
		JsonNode jsonObject = Json.toJson(student);
		return created(Util.createResponse(jsonObject, true));
	}

	public Result update(Http.Request request) {
		JsonNode json = request.body().asJson();
		if (json == null) {
			return badRequest(Util.createResponse("Expecting Json data", false));
		}
		Student student = StudentStore.getInstance().updateStudent(Json.fromJson(json, Student.class));
		if (student == null) {
			return notFound(Util.createResponse("Student not found", false));
		}

		JsonNode jsonObject = Json.toJson(student);
		return ok(Util.createResponse(jsonObject, true));
	}

	public Result retrieve(int id) {
		Student student = StudentStore.getInstance().getStudent(id);
		if (student == null) {
			return notFound(Util.createResponse("Student with id:" + id + " not found", false));
		}
		JsonNode jsonObjects = Json.toJson(student);
		return ok(Util.createResponse(jsonObjects, true));
	}

	public Result delete(int id) {
		boolean status = StudentStore.getInstance().deleteStudent(id);
		if (!status) {
			return notFound(Util.createResponse("Student with id:" + id + " not found", false));
		}
		return ok(Util.createResponse("Student with id:" + id + " deleted", true));
	}

	public Result listStudents() {
		Set<Student> result = StudentStore.getInstance().getAllStudents();
		ObjectMapper mapper = new ObjectMapper();

		JsonNode jsonData = mapper.convertValue(result, JsonNode.class);
		return ok(Util.createResponse(jsonData, true));
	}
}
