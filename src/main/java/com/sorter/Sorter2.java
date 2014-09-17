package com.sorter;

import java.util.ArrayList;

public class Sorter2 {

    public static void main(String[] args) {

        ArrayList<Box> view = packOrder();
        for (int i = 0; i < view.size(); i++) {
            view.get(i);
            System.out.println("Box " + (i + 1) + " :");
            for (int x = 0; x < view.get(i).boxContents.size(); x++) {
                Product item = view.get(i).boxContents.get(x);
                System.out.println("\t" + item.productName);
                System.out.println("\t" + item.productType);
                System.out.println("\t" + item.productSku);
                System.out.println();
            }


        }
    }

    public static ArrayList<Box> packOrder() {
        Product[] sort = OrderGenerator.displayOrder();
        ArrayList<Box> boxList = new ArrayList<Box>();
        Box box = new Box();
        int boxCount = 0;
        boxList.add(box);

        for (int x = 0; x < sort.length; x++) {

            for (int y = 0; sort[x].stowed == false; y++) {

                {

                    if (sort[x].productType.equalsIgnoreCase("Accessory")) {

                        if (boxList.get(y).boxRoom >= sort[x].productSize && (boxList.get(y).boxType.equalsIgnoreCase("Accessory") || boxList.get(y).boxType.equalsIgnoreCase("Unknown"))) {
                            boxList.get(y).boxType = "Accessory";
                            boxList.get(y).boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            boxList.get(y).boxRoom -= sort[x].productSize;
                        } else if (y == boxList.size() - 1)  {
                            boxList.add(new Box());
                            boxCount++;
                            box = boxList.get(boxCount);
                            box.boxType = "Accessory";
                            box.boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            box.boxRoom -= sort[x].productSize;
                        }
                    }

                    if (sort[x].productType.equalsIgnoreCase("Beauty")) {

                        if (boxList.get(y).boxRoom >= sort[x].productSize && (boxList.get(y).boxType.equalsIgnoreCase("Beauty") || boxList.get(y).boxType.equalsIgnoreCase("Unknown"))) {
                            boxList.get(y).boxType = "Beauty";
                            boxList.get(y).boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            boxList.get(y).boxRoom -= sort[x].productSize;
                        } else if (y == boxList.size() - 1) {
                            boxList.add(new Box());
                            boxCount++;
                            box = boxList.get(boxCount);
                            box.boxType = "Beauty";
                            box.boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            box.boxRoom -= sort[x].productSize;
                        }

                    }

                    if (sort[x].productType.equalsIgnoreCase("Clothes")) {

                        if (boxList.get(y).boxRoom >= sort[x].productSize && (boxList.get(y).boxType.equalsIgnoreCase("Clothes") || boxList.get(y).boxType.equalsIgnoreCase("Unknown"))) {
                            boxList.get(y).boxType = "Clothes";
                            boxList.get(y).boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            boxList.get(y).boxRoom -= sort[x].productSize;
                        } else if (y == boxList.size() - 1) {
                            boxList.add(new Box());
                            boxCount++;
                            box = boxList.get(boxCount);
                            box.boxType = "Clothes";
                            box.boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            box.boxRoom -= sort[x].productSize;
                        }

                    }


                    if (sort[x].productType.equalsIgnoreCase("Bags")) {

                        if (boxList.get(y).boxRoom >= sort[x].productSize && (boxList.get(y).boxType.equalsIgnoreCase("Bags") || boxList.get(y).boxType.equalsIgnoreCase("Unknown"))) {

                            boxList.get(y).boxType = "Bags";
                            boxList.get(y).boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            boxList.get(y).boxRoom -= sort[x].productSize;
                        } else if (y == boxList.size() - 1) {
                            boxList.add(new Box());
                            boxCount++;
                            box = boxList.get(boxCount);
                            box.boxType = "Bags";
                            box.boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            box.boxRoom -= sort[x].productSize;
                        }

                    }


                    if (sort[x].productType.equalsIgnoreCase("Shoes")) {


                        if (boxList.get(y).boxRoom >= sort[x].productSize && (boxList.get(y).boxType.equalsIgnoreCase("Shoes") || boxList.get(y).boxType.equalsIgnoreCase("Unknown"))) {

                            boxList.get(y).boxType = ("Shoes");
                            boxList.get(y).boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            boxList.get(y).boxRoom -= sort[x].productSize;
                        } else if (y == boxList.size() - 1) {
                            boxList.add(new Box());
                            boxCount++;
                            box = boxList.get(boxCount);
                            box.boxType = ("Shoes");
                            box.boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            box.boxRoom -= sort[x].productSize;
                        }

                    }


                    if (sort[x].productType.equalsIgnoreCase("Housewares")) {

                        if (boxList.get(y).boxRoom >= sort[x].productSize && (boxList.get(y).boxType.equalsIgnoreCase("Housewares") || boxList.get(y).boxType.equalsIgnoreCase("Unknown"))) {

                            boxList.get(y).boxType = ("Housewares");
                            boxList.get(y).boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            boxList.get(y).boxRoom -= sort[x].productSize;


                        } else if (y == boxList.size() - 1) {
                            boxList.add(new Box());
                            boxCount++;
                            box = boxList.get(boxCount);
                            box.boxType = ("Housewares");
                            box.boxContents.add(sort[x]);
                            sort[x].stowed = true;
                            box.boxRoom -= sort[x].productSize;
                        }
                    }
                }


            }
        }


        System.out.println("You will need " + boxList.size() + " boxes.");


        return boxList;

    }
}
