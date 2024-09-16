package com.munchmate.app.repository;

import com.munchmate.app.entity.Ingredient;
import com.munchmate.app.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}
