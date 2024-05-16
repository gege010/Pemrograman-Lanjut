public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPayableAmount() {
        return pricePerItem * quantity ;
    }

    public String toString() {
        return "\n\nProduct Name\t: " + productName + "\nQuantity\t: " + quantity + "\nPrice /item\t: " + pricePerItem;
    }

}