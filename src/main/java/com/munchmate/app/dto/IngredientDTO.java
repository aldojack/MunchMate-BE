package com.munchmate.app.dto;

import com.munchmate.app.entity.Ingredient;
import com.munchmate.app.enums.IngredientCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IngredientDTO {
    private Integer id;
    private String name;
    private IngredientCategory category;

    public IngredientDTO(Ingredient ingredient){
        this.id = ingredient.getId();
        this.name = ingredient.getName();
        this.category = ingredient.getCategory();
    }
}
