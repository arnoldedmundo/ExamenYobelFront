package com.examen.arnold.services;

import java.awt.PageAttributes.MediaType;
import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.bytebuddy.agent.VirtualMachine.ForHotSpot.Connection.Response;

@Service
public class ApiServiceImpl implements ApiService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private HttpHeaders httpHeaders;
	
	private static final String CHARACTER_API="https://rickandmortyapi.com/api/character";
	
	@Override
	public Character getAllCharacters() {
		httpHeaders.setAccept(List.of(MediaType.APPLICATION.JSON));
		HttpEntity<String> entity= new HttpEntity<>(httpHeaders);
		
		ResponseEntity<Character>response = restTemplate.exchange(CHARACTER_API,HttpMethod.GET,entity,Character.class);
		
		return response.getBody();
	}

}
