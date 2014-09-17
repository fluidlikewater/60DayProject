package com.sorter;
import org.json.JSONObject;

import java.util.Random;


public class Product {

    private String productType;
    private int size;
    private int sku;
    private String name;

    public Product(String productType, int size, int sku, String name) {
        this.productType = productType;
        this.size = size;
        this.sku = sku;
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

}
