package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping ("/")
 public String test(){
	 return "hello";
 }
 
 @RequestMapping ("/call")
 public String call(){
	 return "hello-call";
 }


 @RequestMapping (value="/post",  method=RequestMethod.POST)
 @ResponseBody public String method2(@RequestBody String var){
    return var; 
}
}
