package org.orgselenium.pagefactory.utilities;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

public class TestUtilities {

	public int getResponseCode(String url) {
		  int resp_code=0;
		  
		  try {
			  resp_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			  return resp_code;
		  } catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			return resp_code;
		}
		 return resp_code; 
		  
	  }
}
