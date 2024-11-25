package com.munchmate.app.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Unit {
    TEASPOON("tsp"),
    TABLESPOON("tbsp"),
    GRAM("g"),
    KILOGRAM("kg"),
    POUND("lb"),
    OUNCE("oz"),
    MILLILITER("ml"),
    CLOVE("clove"),
    LITER("l"),
    CUP("cup"),
    WHOLE("whole"),
    SACHET("sachet");

    private final String abbreviation;

    // Constructor
    Unit(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return abbreviation;
    }

    public static Unit fromString(String unit) {
        return Arrays.stream(Unit.values())
                .filter(u -> u.getAbbreviation().equalsIgnoreCase(unit))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid unit: " + unit));
    }

}
