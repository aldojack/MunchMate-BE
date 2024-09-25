package com.munchmate.app.entity;

import com.munchmate.app.dto.RecipeDTO;
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
    private List<RecipeIngredient> ingredients;
    // Instructions
    @ElementCollection
    private List<String> instructions;
    // Source
    @ManyToOne
    @JoinColumn(name="source_id")
    private Source source;
    private String image;
    private Integer cookTime;
    private Integer prepTime;
    private Integer servingSize;

    public Recipe(RecipeDTO recipe){
        this.title = recipe.getTitle();
        //THis line might need to be investigated more
        this.ingredients = recipe.getIngredients().stream().map(RecipeIngredient::new).toList();
        this.instructions = recipe.getInstructions();
        this.source = new Source( recipe.getSource());
        this.image = recipe.getImage();
        this.cookTime = recipe.getCookTime();
        this.prepTime = recipe.getPrepTime();
        this.servingSize = recipe.getServingSize();
    }

}
