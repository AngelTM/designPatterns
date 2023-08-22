package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.Prototype.PriceList;
import com.example.Prototype.Product;

public class Main {
    public static void main(String[] args) {
        
        PriceList priceList = new PriceList("Normal List");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("PC", 15000));
        productList.add(new Product("Mouse", 500));
        productList.add(new Product("Keyboard", 800));
        priceList.setProductList(productList);
        System.out.println(priceList);

        //new list with discount
        PriceList priceList2 = (PriceList) priceList.deepClone();
        priceList2.setName("preferencial List");
        System.out.println(priceList2);
    
        
        for (Product product : priceList2.getProductList()){
            product.setPrice(product.getPrice() * 0.9);
        }

        System.out.println(priceList2);

    }
}