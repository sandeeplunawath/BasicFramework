package webServices_SOAP;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.Test;

public class SOAP_WorkingCode {

	String endPoint = "https://rdtafedev.carmax.org/tafe/v2/Service.svc";
	//String endPoint = "https://rdtafeqa.carmax.org/tafe/v2/Service.svc";


	/**
	 * SOAP Request information , verify in SOAP UI, tool, in RAW tab, and update the below information.
	 * sometimes need to add certificate in jre by using keytool command in command-prompt
	 * we can download certificate from chrome browser as well
	 */
	
	
	@Test
	public void testCase1()
	{
		try {
//			System.setProperty("https.proxyHost", "wcbcproxy.carmax.org");
//			System.setProperty("https.proxyPort", "8080");
			File requestfile = new File(System.getProperty("user.dir") +"/TestData/Request/samplerequest.xml");

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post  = new HttpPost(endPoint);
			post.addHeader(HttpHeaders.CONTENT_TYPE,"text/xml;charset=utf-8");
			post.addHeader("SOAPAction", "http://services.carmax.org/IEngineService/Calculate");
			post.setEntity(new InputStreamEntity(new FileInputStream(requestfile)));
			HttpResponse response = client.execute(post);
			HttpEntity reent = response.getEntity();
			InputStream res = reent.getContent();
			StringBuilder textBuilder = new StringBuilder();
			try (Reader reader = new BufferedReader(new InputStreamReader
					(res, Charset.forName(StandardCharsets.UTF_8.name())))) {
				int c = 0;
				while ((c = reader.read()) != -1) {
					textBuilder.append((char) c);
				}
			}
			System.out.println(textBuilder.toString()
					.replace("&gt;", ">")
					);

//			System.out.println(response.getStatusLine());
//			System.out.println(response.toString());
//			BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//			String line ="";
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
