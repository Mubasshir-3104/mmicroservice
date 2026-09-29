package com.example.multiply.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class MultiplicationController {

    @PostMapping("/multiply/{a}/{b}")
    public ResponseEntity<Integer> multiply(
            @PathVariable Integer a,
            @PathVariable Integer b) {

        return new ResponseEntity<>(a * b, HttpStatus.OK);
    }
}
