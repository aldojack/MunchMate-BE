package com.munchmate.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="ingredient_id", nullable = false)
    private Ingredient ingredient;
    private Double quantity;
    private String unit;
    @ManyToOne
    @JoinColumn(name="recipe_id", nullable = false)
    private Recipe recipe;
}
