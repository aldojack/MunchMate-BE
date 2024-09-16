package com.munchmate.app.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Nullable
    private String url;
    @Nullable
    private String book;
    @Nullable
    private Integer pageNumber;
}
