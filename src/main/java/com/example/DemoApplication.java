package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hello! This is a demo application linked to this tutorial: http://jkutner.github.io/2016/08/18/android-backend-api-heroku-retrofit.html";
  }

  @RequestMapping("/hello")
  @ResponseBody
  String hello(String s) {
    return "Hello from Choko!"+s;  
  }

  @RequestMapping("/prueba")
  @ResponseBody
  String prueba2() {
    return "Hello from the other side -- Otra Prueba23";
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    
  }
}
