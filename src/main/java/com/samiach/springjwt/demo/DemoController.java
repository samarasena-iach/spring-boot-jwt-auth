package com.samiach.springjwt.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    // This comment was placed on 2023-08-18 to test out git features

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Welcome :: DET (Java) - EY Global Delivery Services");
    }

}
