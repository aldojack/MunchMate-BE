package com.munchmate.app.service;

import com.munchmate.app.dto.RecipeDTO;
import com.munchmate.app.dto.RecipeIngredientDTO;
import com.munchmate.app.entity.Ingredient;
import com.munchmate.app.entity.Recipe;
import com.munchmate.app.entity.RecipeIngredient;
import com.munchmate.app.entity.Source;
import com.munchmate.app.enums.Unit;
import com.munchmate.app.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;
    private final IngredientService ingredientService;
    private final RecipeIngredientService recipeIngredientService;
    private final SourceService sourceService;
    @Autowired
    public RecipeService(RecipeRepository recipeRepository, IngredientService ingredientService, RecipeIngredientService recipeIngredientService, SourceService sourceService) {
        this.recipeRepository = recipeRepository;
        this.ingredientService = ingredientService;
        this.recipeIngredientService = recipeIngredientService;
        this.sourceService = sourceService;
    }

    public RecipeDTO getRecipeById(Integer id){
        Recipe found = this.recipeRepository.findById(id).orElseThrow();
        return new RecipeDTO(found);
    }

    public List<RecipeDTO> getAllRecipes(){
        List<Recipe> allRecipes = this.recipeRepository.findAll();
        return allRecipes.stream().map(RecipeDTO::new).toList();
    }

    public RecipeDTO createRecipe(RecipeDTO recipeDTO) {

        Recipe recipe = new Recipe();
        recipe.setTitle(recipeDTO.getTitle());
        recipe.setCookTime(recipeDTO.getCookTime());
        recipe.setPrepTime(recipeDTO.getPrepTime());
        recipe.setServingSize(recipeDTO.getServingSize());
        recipe.setImage(recipeDTO.getImage());
        recipe.setInstructions(recipeDTO.getInstructions());


        List<RecipeIngredient> recipeIngredientsList = new ArrayList<>();
        for(RecipeIngredientDTO recipeIngredient : recipeDTO.getIngredients()){
            //find the ingredient in the database by name
            Ingredient ingredient = new Ingredient(ingredientService.getIngredientByName(recipeIngredient.getName()));
            //Create new recipe ingredient

            RecipeIngredient newRecipeIngredient = this.recipeIngredientService.createRecipeIngredient(ingredient, recipeIngredient.getQuantity(), Unit.fromString(recipeIngredient.getUnit()));
            newRecipeIngredient.setRecipe(recipe);
            recipeIngredientsList.add(newRecipeIngredient);
        }
        recipe.setIngredients(recipeIngredientsList);
        //Create source convert DTO to Entity

        Source source = this.sourceService.createSource(recipeDTO.getSource());
        recipe.setSource(source);

        Recipe savedRecipe = this.recipeRepository.save(recipe);

        return new RecipeDTO(savedRecipe);
    }


}
