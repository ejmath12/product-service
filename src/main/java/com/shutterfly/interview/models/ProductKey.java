package com.shutterfly.interview.models;

import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class ProductKey implements Serializable {
    public String getName() {
        return name;
    }

    public ProductType getType() {
        return type;
    }

    @Field(order = 1)
    private final @NotNull String name;
    @Field(order = 2)
    private final @NotNull ProductType type;
    public ProductKey(@NotNull String name, @NotNull ProductType type) {
        this.name = name;
        this.type = type;
    }
}