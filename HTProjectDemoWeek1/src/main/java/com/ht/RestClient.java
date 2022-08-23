package com.ht;



import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ht.entity.User;

public class RestClient {
	
	private static String url="http://localhost:8090/UserController/getuser";
	private static String url1="http://localhost:8090/UserController/saveuser";
	
	public static void main(String[] args) {
		//get();
		post();
	}
	
	private static void post() {
		RestTemplate restTemp=new RestTemplate();
		User user = new User();
		user.setId(8);
		user.setAge(23);
		user.setName("BAC");
		RestTemplate restTemplate =  new RestTemplate();
		Object response = restTemplate.postForObject(url1, user, Integer.class, new HashMap() );
		System.out.println(response);

	}

	public static void get() {
		RestTemplate restTemp=new RestTemplate();
		ResponseEntity<List> forEntity = restTemp.getForEntity(url, List.class);
		System.out.println(forEntity.getStatusCodeValue());
		System.out.println(forEntity.getBody());
	}

}
