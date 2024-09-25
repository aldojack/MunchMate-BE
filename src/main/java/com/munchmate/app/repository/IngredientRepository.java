package com.munchmate.app.repository;

import com.munchmate.app.dto.IngredientDTO;
import com.munchmate.app.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    public Ingredient findByName(String name);
}
