package com.jd.services;

import com.jd.model.entity.Product;
import com.jd.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll (){
        return productRepository.findAll();
    }
}
