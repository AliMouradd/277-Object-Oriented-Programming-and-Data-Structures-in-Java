package zybooks_labs;

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    public ItemToPurchase(){
        itemName = "name";
        itemPrice = 0;
        itemQuantity = 0;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
}
