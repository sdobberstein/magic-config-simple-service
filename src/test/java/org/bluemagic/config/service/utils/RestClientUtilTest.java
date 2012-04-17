package org.bluemagic.config.service.utils;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

//@Ignore("Can only run it when the server is up, or else tests will fail.")
public class RestClientUtilTest {

	@Test
	public void testGet() {
		URI uri = null;
		
		try {
			uri = new URI("http://localhost:8080/property/some/prop?tags=production");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String rval = RestClientUtil.get(uri);
		System.out.println(rval);
		
		Assert.assertNotNull(rval);
	}
	
	@Test
	public void testPost() {
		String json = "{\"base\":\"some/prop\",\"tags\":[{\"tags\":\"production\"}]}";
		
        URI uri = null;
		
		try {
			uri = new URI("http://localhost:8080/property/some/prop?tags=production");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int responseCode = RestClientUtil.post(uri, json);
		
		Assert.assertTrue(responseCode >= 200);
		Assert.assertTrue(responseCode < 300);
	}
	
	@Test
	public void testDelete() {
        URI uri = null;
		
		try {
			uri = new URI("http://localhost:8080/property/some/prop?tags=production");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int responseCode = RestClientUtil.delete(uri);
		
		Assert.assertTrue(responseCode >= 200);
		Assert.assertTrue(responseCode < 300);
	}
	
	@Test
	public void testPut() {
		String json = "{\"base\":\"some/prop\",\"tags\":[{\"tags\":\"production\"}]}";
		
        URI uri = null;
		
		try {
			uri = new URI("http://localhost:8080/property/some/prop?tags=production");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int responseCode = RestClientUtil.put(uri, json);
		
		Assert.assertTrue(responseCode >= 200);
		Assert.assertTrue(responseCode < 300);
	}
}
