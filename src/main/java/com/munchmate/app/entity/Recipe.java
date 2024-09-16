package com.munchmate.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    // Ingredient List
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecipeIngredient> ingredients = new ArrayList<>();
    // Instructions
    @ElementCollection
    private List<String> instructions = new ArrayList<>();
    // Source
    @ManyToOne
    @JoinColumn(name="source_id")
    private Source source;
    private String image;
    private Integer cookTime;
    private Integer prepTime;
    private Integer servingSize;

}
