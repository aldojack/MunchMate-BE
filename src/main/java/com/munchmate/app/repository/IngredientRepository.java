package com.munchmate.app.repository;

import com.munchmate.app.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    public Ingredient findByName(String name);
}
