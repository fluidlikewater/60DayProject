package com.sorter;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by harrisjo on 9/16/14.
 */
public class Order {

    public static ArrayList<Product> order(int items) {
        ArrayList<Product> order = new ArrayList<Product>();
        for (int i = 0; i < items; i++) {
            order.add(GenerateProduct.generateProduct());
        }
        return order;
    }

    public static JSONArray jsonOrder(int items) {
        JSONObject order = new JSONObject();
        JSONArray ja = new JSONArray();
        for (int i = 0; i <= items; i++) {
            JSONObject item = new JSONObject();
            Product p = GenerateProduct.generateProduct();
            item.put( "name", p.getName() );
            item.put( "type", p.getProductType() );
            item.put( "size", p.getSize());
            ja.put(item);
        }
        order.put( "order", ja );
        return ja;
    }


}
