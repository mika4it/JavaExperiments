package com.example.games.controller;

import com.example.games.model.Product;
import com.example.games.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("product")
@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("{id}")
    public Product get(@PathVariable Long id) {
        return productService.get(id);
    }
}
