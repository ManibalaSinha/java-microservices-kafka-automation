// src/main/java/com/saas/repository/QuizRepository.java
package com.saas.repository;

import com.saas.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByCourseId(String courseId);
}
