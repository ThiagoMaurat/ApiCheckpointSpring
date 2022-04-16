package com.checkpoint.Jogos.dto;

import com.checkpoint.Jogos.model.Category;
import com.checkpoint.Jogos.model.Product;

import java.util.ArrayList;

public class ProductResponseDto {

    private Integer id;
    private String title;
    private String description;
    private Double price;
    private ArrayList<String> images;
    private Category category;
    private String operatingSystem;

    public ProductResponseDto() {
    }

    public ProductResponseDto (Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.images = product.getImages();
        this.category = product.getCategory();
        this.operatingSystem = product.getOperatingSystem();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
