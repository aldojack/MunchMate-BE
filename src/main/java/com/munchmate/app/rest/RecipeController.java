package com.munchmate.app.rest;

import com.munchmate.app.dto.RecipeDTO;
import com.munchmate.app.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;
    @GetMapping
    public List<RecipeDTO> getAllRecipes(){
        return this.recipeService.getAllRecipes();
    }
    @GetMapping("/{id}")
    public RecipeDTO getRecipeById(@PathVariable Integer id){
        return this.recipeService.getRecipeById(id);
    }

    @PostMapping("/add")
    public RecipeDTO addRecipe(@RequestBody RecipeDTO recipeDTO){
        System.out.println("Parameter"+  recipeDTO);
        return this.recipeService.createRecipe(recipeDTO);
    }
}
