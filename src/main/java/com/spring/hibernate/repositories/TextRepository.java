package com.spring.hibernate.repositories;

import com.spring.hibernate.model.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, Integer> {
}
