package com.apimongodb.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apimongodb.mongodb.model.users;
import com.apimongodb.mongodb.repository.UsersRepository;

@RestController
@RequestMapping("/user")
public class UsersControler {

	@Autowired
	private UsersRepository user;
	
	@GetMapping
	public ResponseEntity<List<users>> list(){
		
		List<users> list = user.findAll();
		
		return ResponseEntity.ok(list);
	}
	
	@PostMapping
	public ResponseEntity<users> salvar(@RequestBody users usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(user.save(usuario));
	}
	
	@DeleteMapping
	public void delete(){
		user.deleteAll();
	}
	
}
