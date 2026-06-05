package com.fakenews.model;

import jakarta.persistence.*;

@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 5000)
    private String content;

    private String prediction; // FAKE or REAL

    public News() {}

    public News(Long id, String title, String content, String prediction) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.prediction = prediction;
    }

    // Getters and Setters
}
