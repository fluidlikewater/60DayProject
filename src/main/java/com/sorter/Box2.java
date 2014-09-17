package com.sorter;

import java.util.ArrayList;


public class Box2 {

    public int boxRoom;
    boolean boxFull;
    String boxType;
    ArrayList <Product> boxContents;


    public boolean isBoxFull() {
        return boxFull;
    }

    public void setBoxFull(boolean boxFull) {
        this.boxFull = boxFull;
    }

    public int getBoxRoom() {
        return boxRoom;
    }

    public ArrayList<Product> getBoxContents() {
        return boxContents;
    }

    public void setBoxContents(ArrayList<Product> boxContents) {
        this.boxContents = boxContents;
    }

    public void setBoxRoom(int boxRoom) {
        this.boxRoom = boxRoom;
    }

    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    public Box2() {

        boxRoom = 9;
        boxType = ("Unknown");
        boxFull = false;
        boxContents = new ArrayList<Product>();

    }

    /*public int packBox(int itemSize){
        boxRoom -= itemSize;
        return boxRoom;
    }
    */
}