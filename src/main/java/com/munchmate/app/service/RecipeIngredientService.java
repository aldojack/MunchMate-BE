package com.munchmate.app.service;

import com.munchmate.app.entity.Ingredient;
import com.munchmate.app.entity.RecipeIngredient;
import com.munchmate.app.enums.Unit;
import com.munchmate.app.repository.RecipeIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeIngredientService {
    @Autowired
    RecipeIngredientRepository recipeIngredientRepository;

    public RecipeIngredient createRecipeIngredient(Ingredient ingredient, double quantity, Unit unit){
//        RecipeIngredient newRecipeIngredient = ;
//        return this.recipeIngredientRepository.save(newRecipeIngredient);
        return new RecipeIngredient(ingredient, quantity, unit);
    }
}
