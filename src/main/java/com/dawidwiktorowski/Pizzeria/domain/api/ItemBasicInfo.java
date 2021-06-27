package com.dawidwiktorowski.Pizzeria.domain.api;

public class ItemBasicInfo {
    private Long id;
    private double price;
    private String name;
    private String shortDescription;
    private String description;
    private String imgUrl;

    public ItemBasicInfo(Long id, double price, String name, String shortDescription, String description, String imgUrl) {
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

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
