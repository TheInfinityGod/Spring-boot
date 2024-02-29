package com.example.water.hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
        //hello
        //
        //save 
    }
}

@RestController
@RequestMapping("/add")
class AddNumbersController {
    @PostMapping
    public int addNumbers(@RequestBody AddNumbersRequest request) {
        return request.getNumber1() + request.getNumber2();
    }
}
