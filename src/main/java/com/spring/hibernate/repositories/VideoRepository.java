package com.spring.hibernate.repositories;

import com.spring.hibernate.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
