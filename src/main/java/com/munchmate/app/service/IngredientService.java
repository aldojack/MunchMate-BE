package com.munchmate.app.service;

import com.munchmate.app.dto.IngredientDTO;
import com.munchmate.app.entity.Ingredient;
import com.munchmate.app.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;

    public IngredientDTO createIngredient(IngredientDTO ingredientDTO){
        Ingredient newIngredient = new Ingredient(ingredientDTO);
        Ingredient savedIngredient = this.ingredientRepository.save(newIngredient);
        return new IngredientDTO(savedIngredient);
    }

    public List<Ingredient> getAllIngredients(){
        return ingredientRepository.findAll();
    }
}
