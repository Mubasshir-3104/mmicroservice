package com.example.subtract;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://beautiful-calculatorui.netlify.app")
public class SubtractionController {

    @PostMapping("/subtract/{a}/{b}")
    public ResponseEntity<Integer> subtract(
            @PathVariable Integer a,
            @PathVariable Integer b) {

        return new ResponseEntity<>(a - b, HttpStatus.OK);
    }
}
