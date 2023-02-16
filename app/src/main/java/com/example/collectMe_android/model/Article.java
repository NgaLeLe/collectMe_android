package com.example.collectMe_android.model;

public class Article {
    String name_article;
    String description;
    Date dayStart;

    public Article() {
        super();
    }

    public Article(String name_article, String description, Date dayStart) {
        super();
        this.name_article = name_article;
        this.description = description;
        this.dayStart = dayStart;
    }
    
    public void setNameArticle(String name_article) {
        this.name_article = name_article;
    }
    public String getNameArticle() {
        return this.name_article;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDayStart(Date dayStart) {
        this.dayStart = dayStart;
    }

    public Date getDayStart() {
        return this.dayStart;
    }
}

