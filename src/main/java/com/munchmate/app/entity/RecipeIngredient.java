package com.munchmate.app.entity;

import com.munchmate.app.dto.RecipeIngredientDTO;
import com.munchmate.app.enums.Unit;
import com.munchmate.app.service.IngredientService;
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
    @Enumerated(EnumType.STRING)
    private Unit unit;
    @ManyToOne
    @JoinColumn(name="recipe_id", nullable = false)
    private Recipe recipe;

//    public RecipeIngredient(RecipeIngredientDTO recipeIngredientDTO) {
//
//        this.ingredient = recipeIngredientDTO.getName();
//        this.quantity = recipeIngredientDTO.getQuantity();
//        this.unit = Unit.fromString(recipeIngredientDTO.getUnit());
//    }

    public RecipeIngredient(Ingredient ingredient, Double quantity, Unit unit){
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.unit = unit;
    }

    public RecipeIngredient(RecipeIngredientDTO recipeIngredientDTO) {
    }
}
