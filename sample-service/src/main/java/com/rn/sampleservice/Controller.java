package com.rn.sampleservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String welcomeByDefault(){
        return "Welcome Version v2.1";
    }

    @GetMapping("/hi")
    public String welcomeByHi(){
        return "Welcome and Hi";
    }
}
