package com.jd.services;

import com.jd.model.dto.CategoryRecordDto;
import com.jd.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

//    @Transactional(readOnly = true)
//    public CategoryRecordDto getCategoryDtoById(Long id){
//        return categoryRepository.findCategoryRecordDtoById(id);
//    }

//    public List<CategoryRecordDto> findAll(){
//        List<Category> categories = categoryRepository.findAll();
//
//    }
}
