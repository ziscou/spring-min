package com.example.demo.application.features;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class add {
    @RestController
    @RequestMapping("/pizzas")
    public class Controller{
        @PostMapping
        public ResponseEntity<?> create(@RequestBody Request request){
            return  ResponseEntity.status(HttpStatus.CREATED).body(request);
        }
    }

    public record Request(String id, String name) {
    }
}