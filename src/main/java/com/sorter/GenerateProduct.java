package com.sorter;

import org.json.JSONObject;

import java.util.Random;

/**
 * Created by harrisjo on 9/16/14.
 */

public class GenerateProduct {
    public static Product generateProduct() {
        Random r = new Random();

        int size, sku;
        String type;

        sku = 10000000 + r.nextInt(10000000);
        int prod = 1 + r.nextInt(6);
        switch (prod) {
            case 1: type = "shoes";
                size = 3;
                break;
            case 2: type = "clothes";
                size = 2;
                break;
            case 3: type = "bags";
                size = 3;
                break;
            case 4: type = "housewares";
                size = 5;
                break;
            case 5: type = "beauty";
                size = 2;
                break;
            case 6: type = "accessories";
                size = 1;
                break;
            default:type = null;
                size = 0;
                break;
        }

        String name = "Cool " + type + " " + sku;

        Product product = new Product( type, size , sku, name );

        return product;
    }
}
