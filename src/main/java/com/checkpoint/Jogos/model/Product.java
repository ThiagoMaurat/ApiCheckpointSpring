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
    private String title;
    private String description;
    private Double price;
    @Autowired
    private ArrayList<String> images;
    private String categorie;
    private String OperationSystem;

    public Product() {
    }

    public Product(Integer id, String title, String description, Double price, ArrayList<String> images, String categorie, String OperationSystem) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.images = images;
        this.categorie = categorie;
        this.OperationSystem = OperationSystem;
    }

    public Product(String title, String description, Double price, ArrayList<String> images, String categorie, String OperationSystem) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.images = images;
        this.categorie = categorie;
        this.OperationSystem = OperationSystem;
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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getOperationSystem() {
        return OperationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.OperationSystem = operationSystem;
    }
}
