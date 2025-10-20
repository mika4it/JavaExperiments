package com.example.games.service;

import com.example.games.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    public Product get(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("Product " + id);
        return product;
    }
}
