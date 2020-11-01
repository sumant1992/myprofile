package com.myProfile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myProfile.model.Myprofile;
import com.myProfile.repo.myprofilerepo;

@RestController
public class MyprofileController {

	@Autowired
	myprofilerepo repo;
	
	
	@PostMapping("/")
	public Myprofile saveprofile(@RequestBody Myprofile profile) {
		return repo.save(profile);
	}
	
	@GetMapping("/")
	public String message() {
		return "heello  welcome";
	}
	
	@GetMapping("/all")
	public List<Myprofile> find(){
		return repo.findAll();
	}
	
	
}
