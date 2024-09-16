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
    //Get Requests
    @GetMapping
    public List<Ingredient> getAllIngredients(){
        return this.ingredientService.getAllIngredients();
    }
    @GetMapping("/{id}")
    public IngredientDTO getIngredientById(@PathVariable Integer id){
        return this.ingredientService.getIngredientById(id);
    }
    //Post Requests
    @PostMapping("/add")
    public IngredientDTO createIngredient(@RequestBody IngredientDTO ingredientDTO){
        return this.ingredientService.createIngredient(ingredientDTO);
    }
    //Delete Requests
    @DeleteMapping("/{id}")
    public IngredientDTO deleteIngredientById(@PathVariable Integer id){
        return this.ingredientService.deleteIngredientById(id);
    }
    //Patch Requests

}
