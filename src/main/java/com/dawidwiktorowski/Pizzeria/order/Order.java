package com.dawidwiktorowski.Pizzeria.order;


public class Order {
    private Long id;
    private Double price;
    private String name;
    private String address;
    private String telephone;
    private Long goodsId ;
    private Long condition;

    public Order(Long id, Double price, String name, String address, String telephone) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public Order(Long id, Double price, String name, String address, String telephone, Long goodsId, Long condition) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.goodsId = goodsId;
        this.condition = condition;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getCondition() {
        return condition;
    }

    public void setCondition(Long condition) {
        this.condition = condition;
    }
}