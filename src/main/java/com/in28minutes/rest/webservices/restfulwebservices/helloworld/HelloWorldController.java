package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {


    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello Worxxld";
    }


    @GetMapping("/hello-world-bean/{message}")
    public HelloWorldBean helloWorldbean(@PathVariable String message){
        //throw new RuntimeException("Something went wrong");
        return new HelloWorldBean(String.format("Hello World, %s" ,message));
    }
}
