package com.checkpoint.Jogos.dto;

import com.checkpoint.Jogos.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ProductDto {
    private Integer id;
    private String title;
    private String description;
    private Double price;
    private ArrayList<String> images;
    private Integer category;
    private String operatingSystem;

    public ProductDto() {
    }

    public ProductDto(Integer id, String title, String description, Double price, ArrayList<String> images, Integer category, String operatingSystem) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.images = images;
        this.category = category;
        this.operatingSystem = operatingSystem;
    }

    public ProductDto(String title, String description, Double price, ArrayList<String> images, Integer category, String operatingSystem) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.images = images;
        this.category = category;
        this.operatingSystem = operatingSystem;
    }

    public ProductDto(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.images = product.getImages();
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
