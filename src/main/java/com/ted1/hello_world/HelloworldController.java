package com.ted1.hello_world;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloworldController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String helloworld(){
        return "Hello World!!!!!!!!!!";
    }
}
