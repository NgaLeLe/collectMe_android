package com.example.collectMe_android.model;

public class Category {
    String name_category;
    String description_cat;

    public Category() {
        super();
    }

    public Category(String name_category, String  description_cat) {
        super();
        this.name_category = name_category;
        this.description_cat = description_cat;
    }
    
    public void setNameCategory(String name_category) {
        this.name_category = name_category;
    }
    public String getNameCategory() {
        return this.name_category;
    }
    
    public void setDescriptionCat(String description_cat) {
        this.description_cat = description_cat;
    }
    
    public String getDescriptionCat() {
        return this.description_cat;
    }
}

