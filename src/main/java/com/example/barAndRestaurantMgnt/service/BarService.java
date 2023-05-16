package com.example.barAndRestaurantMgnt.service;

import com.example.barAndRestaurantMgnt.model.Bar;

import java.util.List;

public interface BarService {

    // method Signnature;
    //return value, method name;
    Bar registerProduct(Bar bar);
    Bar updateProduct(Bar bar);
    void deleteProduct(Bar bar);
    List<Bar> productList();
    Bar findProductByProductId(Bar bar);



}
