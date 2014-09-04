package sorter;

public class Box {

    private String boxType;
    private int productSize;
    private boolean boxFull;
    private int boxRoom;


    // When a new box is made it is given the productType & productSize. All boxes start out with 9 units and are not full.
    public Box(String productType, int productSize) {
        boxType = productType;
        this.productSize = productSize;
        this.boxFull = false;
        this.boxRoom = 9;
    }

    public boolean getBoxFull() {
        return boxFull;
    }

    public String getBoxType() {
        return boxType;
    }

    public int reduceBoxRoom(int productSize) {
        boxRoom -= productSize;
        if ( boxRoom < productSize ) {
            boxFull = true;
        }
        return boxRoom;
    }

}
