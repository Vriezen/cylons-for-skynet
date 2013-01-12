package BasicHttp;

import java.net.*;
import java.io.*;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.DefaultHttpServerConnection;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;



public class BasicHTTP {

	public static void main(String args[])
	{
		
		Socket sock = null;
		try {
			sock = new Socket("localhost", 23);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		HttpParams params = new BasicHttpParams();
		
		DefaultHttpServerConnection conn = new DefaultHttpServerConnection();
		
		try {
			conn.bind(sock, params);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		HttpRequest request = null;
		try {
			request = conn.receiveRequestHeader();
		} catch (HttpException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(request instanceof HttpEntityEnclosingRequest)
		{
			try {
				conn.receiveRequestEntity((HttpEntityEnclosingRequest) request);
			} catch (HttpException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpEntity entity = ((HttpEntityEnclosingRequest) request).getEntity();
			
			if(entity != null)
			{
				System.out.println("Entity was received!");
			}
		}
		
		HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,200, "OK");
		try {
			response.setEntity(new StringEntity("Got it"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.sendResponseHeader(response);
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.sendResponseEntity(response);
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
