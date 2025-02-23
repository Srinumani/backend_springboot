package com.backend.onetomany.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class demo {

    @GetMapping("/user")     
    public String method(){
        return "Its working....";
    }

}
