package com.example.modulo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class ModuloController {

    @PostMapping("/modulo/{a}/{b}")
    public ResponseEntity<?> modulo(
            @PathVariable Integer a,
            @PathVariable Integer b) {

        if (b == 0) {
            return new ResponseEntity<>("Cannot take modulo by zero", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(a % b, HttpStatus.OK);
    }
}
