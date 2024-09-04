package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.arnold.services.ApiServiceImpl;

@RestController
public class ApiController {
	
	@Autowired
	private ApiServiceImpl apiservice;
	
	@GetMapping()
	public ResponseEntity<Character> getCharacters(){
		Character allCharacters = apiservice.getAllCharacters();
		return new ResponseEntity<>(allCharacters,HttpStatus.OK);
	}

}
 