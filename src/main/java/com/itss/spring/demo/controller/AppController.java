package com.itss.spring.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("Init appp");
    }
}
