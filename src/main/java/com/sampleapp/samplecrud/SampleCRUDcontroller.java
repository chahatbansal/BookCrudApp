package com.sampleapp.samplecrud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleCRUDcontroller {
    @RequestMapping("/")
    public String samplecrud(){
        return "Hello from Spring Boot";
    }
}
