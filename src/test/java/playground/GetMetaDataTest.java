//package playground;
//
//import java.io.IOException;
//
//import org.junit.Test;
//
//import com.squareup.okhttp.OkHttpClient;
//import com.squareup.okhttp.Request;
//import com.squareup.okhttp.Response;
//
//public class GetMetaDataTest {
//	@Test
//	public void GetData() throws IOException {
//		System.out.println("Response Code is this");
//		OkHttpClient client = new OkHttpClient();
//		Request request = new Request.Builder().url("http://metadata.google.internal/computeMetadata/v1/instance/image")
//				.method("GET", null).addHeader("Metadata-Flavor", "Google").build();
//		Response response = client.newCall(request).execute();
//		int a = response.code();
//		System.out.println("Response Code is this");
//
//	}
//}
