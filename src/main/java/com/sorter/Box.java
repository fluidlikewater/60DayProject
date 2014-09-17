package com.sorter;

import java.util.ArrayList;

public class Box {

    private String boxType;
    private boolean boxFull;
    private int boxRoom;

    private ArrayList<String> names;

    // When a new box is made it is given the productType & productSize. All boxes start out with 9 units and are not full.
    public Box(String productType) {
        boxType = productType;
        this.boxFull = false;
        this.boxRoom = 9;
        this.names = new ArrayList<String>();
    }

    public boolean getBoxFull() {
        return boxFull;
    }

    public String getBoxType() {
        return boxType;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public int reduceBoxRoom(int productSize) {
        boxRoom -= productSize;
        if ( boxRoom < productSize ) {
            boxFull = true;
        }
        return boxRoom;
    }

    public static Box newBox( String type ) {
        Box b = new Box( type );
        return b;
    }

    public void addProduct( String name ) {
        names.add(name);
    }
}
