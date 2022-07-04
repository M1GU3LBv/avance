/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alarc
 */
@Controller
public class HomeController {
  @GetMapping()
    public String login(){
    return "login";
    }
    @GetMapping("/menu")
    public String menu(){
        return "menu";
    
    
    }   
}
