package com.jd.repositories;

import com.jd.model.dto.ProductRecordDto;
import com.jd.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("""
        SELECT new com.jd.model.dto.ProductRecordDto(p.id, p.title, p.price) 
        FROM Product p 
        WHERE p.id=:id
        """)
    ProductRecordDto findProductRecordDtoById(@Param("id") Long id);
}
