// src/main/java/com/saas/repository/CourseRepository.java
package com.saas.repository;

import com.saas.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByTeacherEmail(String email);
}
