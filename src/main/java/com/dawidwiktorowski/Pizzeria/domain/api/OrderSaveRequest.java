package com.dawidwiktorowski.Pizzeria.domain.api;

public class OrderSaveRequest {
    private Long id;
    private Double price;
    private String name;
    private String address;
    private String telephone;
    private Long goodsId;
    private Long condition;

    public OrderSaveRequest(Long id, Double price, String name, String address, String telephone, Long goodsId, Long condition) {
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

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public Long getCondition() {
        return condition;
    }

}

