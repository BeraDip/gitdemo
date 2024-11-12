package com.example.diii.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.diii.entity.UserEntity;
import com.example.diii.repository.UserRepository;

@Service
public class UserServices {
	@Autowired
	UserRepository userRepository; 
	
	public void saveAll(UserEntity user) {
		userRepository.save(user);
	}

	public List<UserEntity> getAllUser(){
		return userRepository.findAll();
	}
	public void delete(int id){
		userRepository.deleteById(id);
	}
}
