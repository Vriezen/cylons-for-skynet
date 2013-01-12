package BasicHttp;

import java.net.*;
import java.io.*;


public class BasicHTTP {

	public static void main(String args[])
	{
		URL google = null;
		URLConnection conn = null;
		try {
			google = new URL("http://localhost:8080");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		try {
			conn = google.openConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String inputLine;
		try {
			while ((inputLine = in.readLine())!= null)
				System.out.println(inputLine);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
