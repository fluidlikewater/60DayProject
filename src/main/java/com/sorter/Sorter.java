
package com.sorter;

import java.util.ArrayList;
import org.json.JSONObject;

/**
 * Created by harrisjo on 9/10/14.
 */

public class Sorter {
    public static ArrayList<Box> sorter( int items ) {

        ArrayList<Product> orderItems = Order.order(items);

        ArrayList<Box> boxes= new ArrayList<Box>();

        //json();
        for ( int i = 0; i < orderItems.size(); i++ ) {
            boolean stowed = false;
            if ( boxes.size() == 0 ) {
                boxes.add(Box.newBox(orderItems.get(i).getProductType()));
                boxes.get(0).reduceBoxRoom(orderItems.get(i).getSize());
                boxes.get(0).addProduct(orderItems.get(i).getName());
                stowed = true;
            }

            if ( stowed == false ) {
                for (int j = 0; j < boxes.size(); j++) {
                    if (orderItems.get(i).getProductType() == boxes.get(j).getBoxType() && boxes.get(j).getBoxFull() == false) {
                        boxes.get(j).reduceBoxRoom(orderItems.get(i).getSize());
                        boxes.get(j).addProduct(orderItems.get(i).getName());
                        stowed = true;
                    }
                }
            }

            if ( stowed == false ) {
                boxes.add(Box.newBox(orderItems.get(i).getProductType()));
                boxes.get((boxes.size() - 1)).reduceBoxRoom(orderItems.get(i).getSize());
                boxes.get((boxes.size() - 1)).addProduct(orderItems.get(i).getName());
            }
        }
/*
        for ( int k = 0; k < boxes.size(); k++ ) {
            JSONObject boxx = new JSONObject(boxes.get(k));
            System.out.println(boxx.toString());
            System.out.println( "Box #" + (k + 1) );
                for ( int l = 0; l < boxes.get(k).getNames().size(); l ++ ) {
                    System.out.println("\t" + boxes.get(k).getNames().get(l));
                }
        }
*/
        return boxes;

    }

}
