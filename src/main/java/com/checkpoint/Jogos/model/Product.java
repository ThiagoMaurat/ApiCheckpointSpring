package com.checkpoint.Jogos.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titles;
    private String descriptions;
    private Double prices;
    @Autowired
    private ArrayList<String> images;
    private String categories;
    private String OperationSystem;

    public Product() {
    }

    public Product(Integer id, String titles, String descriptions, Double prices, ArrayList<String> images, String categories, String OperationSystem) {
        this.id = id;
        this.titles = titles;
        this.descriptions = descriptions;
        this.prices = prices;
        this.images = images;
        this.categories = categories;
        this.OperationSystem = OperationSystem;
    }

    public Product(String titles, String descriptions, Double prices, ArrayList<String> images, String categories, String OperationSystem) {
        this.titles = titles;
        this.descriptions = descriptions;
        this.prices = prices;
        this.images = images;
        this.categories = categories;
        this.OperationSystem = OperationSystem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getOperationSystem() {
        return OperationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.OperationSystem = operationSystem;
    }
}
