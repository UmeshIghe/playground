package playground;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.jayway.jsonpath.JsonPath;

public class JsonParserTest {

	@Test
	public void testJson01() {
		String jsonString = "{\"a\":{\"b\":{\"c\":\"d\"}}}";
		String jsonPath = "$.a.b.c";

		assertEquals("d", JsonPath.read(jsonString, jsonPath).toString());

	}

	@Test
	public void testJson02() {
		String jsonString = "{\"a\":{\"b\":{\"c\":\"d\"}}}";
		String jsonPath = "$.a";

		Map<String, Map<String, String>> testMap = new HashMap<>();

		Map<String, String> bmap = new HashMap<>();
		bmap.put("c", "d");

		testMap.put("b", bmap);

		assertEquals(testMap, JsonPath.read(jsonString, jsonPath));

	}

	@Test
	public void testJson03() throws IOException, URISyntaxException {

		String data = new String(
				Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/artifacts/book.json")));

		String jsonPath = "$.book[?(@.author == 'Ben Smith')].title";
//				"$.book.[*].title";
//		$.book[?(@.author == 'Ben Smith')] 
		List<String> actualValue = JsonPath.read(data, jsonPath);

		assertEquals("Beginning JSON", actualValue.get(0));

	}

}
