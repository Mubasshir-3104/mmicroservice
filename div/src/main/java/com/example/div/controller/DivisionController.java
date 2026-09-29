package com.example.div.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://mmicroservice-production-60cb.up.railway.app")
public class DivisionController {

    @PostMapping("/divide/{a}/{b}")
    public ResponseEntity<?> divide(
            @PathVariable Integer a,
            @PathVariable Integer b) {

        if (b == 0) {
            return new ResponseEntity<>("Cannot divide by zero", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(a / b, HttpStatus.OK);
    }
}
