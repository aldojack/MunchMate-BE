package com.munchmate.app.rest;

import com.munchmate.app.dto.IngredientDTO;
import com.munchmate.app.entity.Ingredient;
import com.munchmate.app.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;
    @GetMapping
    public List<Ingredient> getAllIngredients(){
        return this.ingredientService.getAllIngredients();
    }
    @PostMapping("/add")
    public IngredientDTO createIngredient(@RequestBody IngredientDTO ingredientDTO){
        return this.ingredientService.createIngredient(ingredientDTO);
    }

}
