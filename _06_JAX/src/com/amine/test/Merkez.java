package com.amine.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Merkez {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://localhost:8080/_06_JAX/kullanici/bilgi/15");
			try {
				HttpURLConnection connection =(HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Accept","application/xml");
				
				if(connection.getResponseCode() != 200) {
					throw new RuntimeException("Hata meydana geldi" +connection.getResponseCode());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
