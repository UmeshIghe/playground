package playground.training;

import com.jayway.jsonpath.JsonPath;

public class JsonParser {

	public static void main(String[] args) {
		String jsonString = "{\"a\":{\"b\":{\"c\":\"d\"}}}";
		String jsonPath = "$.a.b.c";

		System.out.println(JsonPath.read(jsonString, jsonPath).toString());

	}

}
