package com.example.diii.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.diii.entity.Login;
import com.example.diii.entity.UserEntity;
import com.example.diii.services.UserServices;

import jakarta.persistence.GenerationType;
import jakarta.persistence.PostLoad;

@Controller
public class LoginController {

    @Autowired
    UserServices userServices;

    @RequestMapping(value = "/login", method =RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/userEntity/delete/{id}", method =RequestMethod.GET)
    public String del(@PathVariable int id,Model model){
        userServices.delete(id);
        List<UserEntity> allUser=userServices.getAllUser();
        model.addAttribute("allUser", allUser);
        return "dasboard";
    }

    
    
    
    @PostMapping("/dasboard")
    public String view(@ModelAttribute Login login , Model model){
        List<UserEntity> allUser=userServices.getAllUser();
    String name=login.getUserName();
    String n="dip";
    System.out.println(n);
    System.out.println(name);
        if(1==1) {
            model.addAttribute("allUser", allUser);
          return "dasboard";
        }
        else
        {
            return "login";
        }
       
    }

    



}
