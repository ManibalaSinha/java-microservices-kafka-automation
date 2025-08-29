// src/main/java/com/saas/entity/Quiz.java
package com.saas.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "quizzes")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseId;

    private String title;

    private String description;
}
