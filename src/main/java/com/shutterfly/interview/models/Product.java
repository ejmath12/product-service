package com.shutterfly.interview.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {
    @Id
    private ProductKey id;
    private String name;
    private ProductType type;
    private double price;
    private long inventoryCount;
    private String imgUrl;

    public Product() {
    }

    public Product(String name, ProductType type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ProductKey getId() {
        return id;
    }

    public void setId(ProductKey id) {
        this.id = id;
    }

    public long getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(long inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

