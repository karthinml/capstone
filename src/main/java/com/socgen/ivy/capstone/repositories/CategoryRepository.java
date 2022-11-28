package com.socgen.ivy.capstone.repositories;

import com.socgen.ivy.capstone.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category save(Category category);
    Category findOneById(Long id);
    void deleteById(Long id);
}
