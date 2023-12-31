package com.nurseryProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String category;
    private String price;

    public Plant(int id, String name, String category, String price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Plant() {

        super();
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public String getPrice() {

        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }
}
