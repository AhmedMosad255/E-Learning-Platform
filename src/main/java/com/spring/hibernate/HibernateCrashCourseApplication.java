package com.spring.hibernate;

import com.spring.hibernate.model.Text;
import com.spring.hibernate.model.Video;
import com.spring.hibernate.repositories.TextRepository;
import com.spring.hibernate.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateCrashCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateCrashCourseApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(
            VideoRepository videoRepository,
            TextRepository textRepository){
        return args -> {
            var video = Video.builder()
                    .name("abc")
                    .length(50)
                    .build();
            videoRepository.save(video);
        };
    }
}
