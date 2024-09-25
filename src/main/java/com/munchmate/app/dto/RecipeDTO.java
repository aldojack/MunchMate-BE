package com.munchmate.app.dto;

import com.munchmate.app.entity.Recipe;
import com.munchmate.app.entity.RecipeIngredient;
import com.munchmate.app.entity.Source;
import com.munchmate.app.service.IngredientService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RecipeDTO {
    private Integer id;
    private String title;
    private List<RecipeIngredientDTO> ingredients;
    private List<String> instructions;
    private SourceDTO source;
    private String image;
    private Integer cookTime;
    private Integer prepTime;
    private Integer servingSize;

    public RecipeDTO(Recipe recipe){
        this.id = recipe.getId();
        this.title = recipe.getTitle();
        this.ingredients = recipe.getIngredients().stream()
                .map(RecipeIngredientDTO::new)
                .toList();
        this.instructions = recipe.getInstructions();
        this.source = new SourceDTO(recipe.getSource());
        this.image = recipe.getImage();
        this.cookTime = recipe.getCookTime();
        this.prepTime = recipe.getPrepTime();
        this.servingSize = recipe.getServingSize();
    }

    @Override
    public String toString() {
        return "RecipeDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", ingredients=" + ingredients +
                ", instructions=" + instructions +
                ", source=" + source +
                ", image='" + image + '\'' +
                ", cookTime=" + cookTime +
                ", prepTime=" + prepTime +
                ", servingSize=" + servingSize +
                '}';
    }
}
