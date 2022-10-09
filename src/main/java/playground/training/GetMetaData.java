package playground.training;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

//java -cp playground-0.0.1-SNAPSHOT-jar-with-dependencies.jar playground.training.GetMetaData
public class GetMetaData {

	public static void main(String[] args) {
		String meta = args[0];
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url("http://metadata.google.internal/computeMetadata/v1/" + meta)
				.method("GET", null).addHeader("Metadata-Flavor", "Google").build();
		Response response;
		try {
			response = client.newCall(request).execute();
			String body = response.body().string().strip();
			System.out.println("Response Code is this" + body);
		} catch (IOException e) {

			System.out.println("Error occured while getting metadata" + e.getMessage());

		}

	}

}
