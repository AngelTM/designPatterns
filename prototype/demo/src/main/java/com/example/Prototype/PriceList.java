package com.example.Prototype;

import java.util.ArrayList;
import java.util.List;

public class PriceList implements IPrototype {


    private String name;
    private List<Product> productList = new ArrayList<>();

  

    public PriceList(String name) {
        this.name = name;
    }

    @Override
    public IPrototype clone() {
        PriceList clone = new PriceList(this.name);
        clone.setProductList(this.productList);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        PriceList clone = new PriceList(this.name);
        List<Product> cloneProducts = new ArrayList<>();
        for (Product product : this.productList) {
            cloneProducts.add((Product) product.clone());
        }
        clone.setProductList(cloneProducts);
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this))+ " - PriceList [name=" + name + ", productList=" + productList + "]";
    }
    
}
