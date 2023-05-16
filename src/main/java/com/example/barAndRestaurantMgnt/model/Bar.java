package com.example.barAndRestaurantMgnt.model;

import jakarta.persistence.*;

@Entity


public class Bar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "productID")
    private Long productId;
    @Column(name = "productName")
    private  String productName;
    @Column(name = "stock")
    private String stock;
    @Column(name = "sales")
    private String sales;
    @Column(name = "balance")
    private String balance;
    @Column(name = "price")
    private String price;
    @Column(name = "amount")
    private String amount;

    public Bar() {
    }

    public Bar(int id) {
        this.id = id;
    }

    public Bar(int id, Long productId, String productName, String stock, String sales, String balance, String price, String amount) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.stock = stock;
        this.sales = sales;
        this.balance = balance;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
