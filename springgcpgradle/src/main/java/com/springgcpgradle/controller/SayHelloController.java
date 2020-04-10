package com.springgcpgradle.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class SayHelloController {


    @GetMapping("/sayhello")
    public ResponseEntity sayHello() {
        return new ResponseEntity("Hello Yahia. Gradle build !", HttpStatus.OK);
    }
}
