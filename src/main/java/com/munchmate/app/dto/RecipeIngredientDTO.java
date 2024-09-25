package com.munchmate.app.dto;

import com.munchmate.app.entity.Ingredient;
import com.munchmate.app.entity.RecipeIngredient;
import com.munchmate.app.enums.Unit;
import com.munchmate.app.service.IngredientService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RecipeIngredientDTO {
    private Integer id;

    //    private String ingredient;
    private String name;
    private Double quantity;
    private String unit;

    public RecipeIngredientDTO(RecipeIngredient recipeIngredient){
        this.id = recipeIngredient.getId();
        this.name = recipeIngredient.getIngredient().getName();
        this.quantity = recipeIngredient.getQuantity();
        this.unit = recipeIngredient.getUnit().getAbbreviation();
    }

    @Override
    public String toString() {
        return "RecipeIngredientDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}
