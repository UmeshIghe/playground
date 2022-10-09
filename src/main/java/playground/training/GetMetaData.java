package playground.training;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class GetMetaData {

	public static void main(String[] args) throws IOException {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url("http://metadata.google.internal/computeMetadata/v1/instance/image")
				.method("GET", null).addHeader("Metadata-Flavor", "Google").build();
		Response response = client.newCall(request).execute();
	int a =	response.code();
	System.out.println("Response Code is this");

	}

}
