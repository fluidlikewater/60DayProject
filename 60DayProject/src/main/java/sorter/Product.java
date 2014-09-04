package sorter;

public class Product {

    private String productType;
    private int productSize;
    private int sku;

    public Product(String productType, int productSize, int sku) {
        this.productType = productType;
        this.productSize = productSize;
        this.sku = sku;
    }

    public String getProductType() {
        return productType;
    }

    public int getProductSize() {
        return productSize;
    }

    public int getSku() {
        return sku;
    }

    // if we want to put the product builder in here we don't need a lot of the setters and getters

    public static Product generateProduct() {
        Product product = new Product( "shoes", 3 , 1234567 );
        Product prod = new Product( "hat", 1, 987654 );
        System.out.println( product.productSize + " " + product.productType + " " + product.sku );
        System.out.println( prod.productSize + " " + prod.productType + " " + prod.sku );
        return product;
    }
}
