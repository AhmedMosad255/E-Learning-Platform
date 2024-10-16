package com.spring.hibernate.repositories;

import com.spring.hibernate.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
