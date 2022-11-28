package com.socgen.ivy.capstone.repositories;

import com.socgen.ivy.capstone.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author save(Author author);
    Author findOneById(Long id);
    void deleteById(Long id);
}
