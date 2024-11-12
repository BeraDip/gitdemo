package com.example.diii.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.diii.entity.UserEntity;
import com.example.diii.services.UserServices;

@Controller
public class HomeController {
	
	@Autowired
	UserServices userServices;
	@ResponseBody
	@PostMapping("/save")
	public String saveAllData(@RequestBody UserEntity userEntity) {
		userServices.saveAll(userEntity);
		return "save done";
	}

}
