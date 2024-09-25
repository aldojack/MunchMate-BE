package com.munchmate.app.repository;

import com.munchmate.app.entity.Recipe;
import com.munchmate.app.entity.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Integer> {

}
