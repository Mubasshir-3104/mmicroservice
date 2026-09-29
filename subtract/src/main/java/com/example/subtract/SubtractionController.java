package com.example.subtract;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class SubtractionController {

    @PostMapping("/subtract/{a}/{b}")
    public ResponseEntity<Integer> subtract(
            @PathVariable Integer a,
            @PathVariable Integer b) {

        return new ResponseEntity<>(a - b, HttpStatus.OK);
    }
}