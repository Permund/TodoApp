package com.in28minutes.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthenticationController {


    @GetMapping("/basicauth")
    public AuthenticatedBean helloWorldbean(){
        //throw new RuntimeException("Something went wrong");
        return new AuthenticatedBean("You are authenticated");
    }
}
