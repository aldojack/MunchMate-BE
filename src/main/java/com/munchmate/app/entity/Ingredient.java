package com.munchmate.app.entity;

import com.munchmate.app.dto.IngredientDTO;
import com.munchmate.app.enums.IngredientCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @NotNull
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private IngredientCategory category;

    public Ingredient(IngredientDTO ingredient) {
        this.name = ingredient.getName();
        this.category = ingredient.getCategory();
    }
}
