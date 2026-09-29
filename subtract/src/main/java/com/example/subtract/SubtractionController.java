package com.example.subtract;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "zealous-optimism-production-eb79.up.railway.app")
public class SubtractionController {

    @PostMapping("/subtract/{a}/{b}")
    public ResponseEntity<Integer> subtract(
            @PathVariable Integer a,
            @PathVariable Integer b) {

        return new ResponseEntity<>(a - b, HttpStatus.OK);
    }
}
