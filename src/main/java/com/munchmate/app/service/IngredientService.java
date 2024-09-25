package com.munchmate.app.service;

import com.munchmate.app.dto.IngredientDTO;
import com.munchmate.app.entity.Ingredient;
import com.munchmate.app.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;

    public List<Ingredient> getAllIngredients(){
        return ingredientRepository.findAll();
    }

    public IngredientDTO getIngredientById(Integer id){
        //Implement exception
        Ingredient found = this.ingredientRepository.findById(id).orElseThrow();
        return new IngredientDTO(found);
    }

    public IngredientDTO createIngredient(IngredientDTO ingredientDTO){
        //Maybe check if Ingredient exists first or name unique
        Ingredient newIngredient = new Ingredient(ingredientDTO);
        Ingredient savedIngredient = this.ingredientRepository.save(newIngredient);
        return new IngredientDTO(savedIngredient);
    }

    public IngredientDTO getIngredientByName(String name) {
        Ingredient found = this.ingredientRepository.findByName(name);
        return new IngredientDTO(found);
    }



    public IngredientDTO deleteIngredientById(Integer id){
        //Implement exception
        Ingredient toDelete = this.ingredientRepository.findById(id).orElseThrow();
        this.ingredientRepository.deleteById(toDelete.getId());
        return new IngredientDTO(toDelete);
    }


}
