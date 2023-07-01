package com.nurseryProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyPlants")
public class MyPlantList {
	
    @Id
    private int id;
    private String name;
    private String category;
    private String price;
    public MyPlantList(){
        super();
    }

    public MyPlantList(int id, String name, String category, String price) {
        super();
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
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
