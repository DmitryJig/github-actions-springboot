package com.jd.services;

import com.jd.model.dto.ProductRecordDto;
import com.jd.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<ProductRecordDto> findAll (){
        return productRepository.findAll().stream().map(p -> new ProductRecordDto(p.getId(), p.getTitle(), p.getPrice())).toList();
    }

    @Transactional(readOnly = true)
    public ProductRecordDto findById(Long id) {
        return productRepository.findProductRecordDtoById(id);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
