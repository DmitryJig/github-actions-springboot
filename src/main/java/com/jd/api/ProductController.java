package com.jd.api;

import com.jd.model.dto.ProductRecordDto;
import com.jd.model.entity.Product;
import com.jd.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductRecordDto> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductRecordDto findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteById(id);
    }
}
