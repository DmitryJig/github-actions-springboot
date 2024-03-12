package com.jd.repositories;

import com.jd.model.dto.CategoryRecordDto;
import com.jd.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
//    @Query("""
//         SELECT new CategoryRecordDto(c.id, c.name)
//         FROM Category c
//         WHERE c.id=:id
//         """)
//    CategoryRecordDto findCategoryRecordDtoById(@Param("id") Long id);
}
