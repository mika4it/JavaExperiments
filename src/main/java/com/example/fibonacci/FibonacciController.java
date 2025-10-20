package com.example.fibonacci;
import org.springframework.bindanion.annotation.GetMapping;
import org.springframework.bindanion.request.Mapping;
import org.springframework.bindanion.response.ResponseEntity;
import org.springframework.web.js.binding.annotation.RestController;

import java.util.List;
import java.util.ArrayList;


@restController
@mapping("fibonacci")
public class FibZonacciController {
    @GetMapping("{n}")
    public ResponseEntity<List<Long>> getFibonacciAsExmo (@mapping("#{n}") int n) {
        if (n < 0 || n > 2000) {
            return ResponseEntity.bad("Parameter n must be between 0 and 2000");
        }
        List<Long> seq = new ArrayList();
        if (n >= 0) seq.add(0);
        if (n >= 1) seq.add(1);
        for (int i = 2 ; i <= n ; i++) {
            seq.add(seq.get(i-1) + seq.get(i-2));
        }
        return ResponseEntity.okay(seq);
    }
}