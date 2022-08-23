package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }
    @RequestMapping(value = "/Hello/{name}", method = RequestMethod.GET)
    public String HelloWorld(@PathVariable("name") String n){
        return "Hello"+n;
    }
}
