package com.dawidwiktorowski.Pizzeria.item;

public class Item {
    private Long id;
    private Double price;
    private String name;
    private String shortDescription;
    private String description;
    private String imgUrl;

    public Item(Long id, Double price, String name, String shortDescription, String description, String imgUrl) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.shortDescription = shortDescription;
        this.description = description;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

