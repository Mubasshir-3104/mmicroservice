package com.example.add.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AdditionController {

    @PostMapping("/add/{a}/{b}")
    public ResponseEntity<Integer> add(
            @PathVariable Integer a,
            @PathVariable Integer b) {

        return new ResponseEntity<>(a + b, HttpStatus.OK);
    }
}
