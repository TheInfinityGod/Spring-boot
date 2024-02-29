package com.example.water.hello;

import java.net.http.HttpHeaders;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

@RequestMapping(value = {"/Amt"}, method = {RequestMethod.POST}, produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
public ResponseEntity<?> retrieve(@Valid @RequestBody(required = true) RetrieveFormsRequest retrieveFormsRequest,@RequestHeader HttpHeaders httpHeaders) {
    String ind = ("IND");
    RetrieveFormsResponse retrieveFormsResponse = myManagementhandler.myMethod(retrieveFormsRequest, ind);
    return new ResponseEntity<RetrieveFormsResponse>(retrieveFormsResponse, HttpStatus.OK);

}


}

