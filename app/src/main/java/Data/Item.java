package Data;

public class Item {
    private int itemID;
    private int categoryID;
    private int stock;
    private int unitPrice;

    public Item() {

    }

    public Item(int itemID, int categoryID, int stock, int unitPrice) {
        this.itemID = itemID;
        this.categoryID = categoryID;
        this.stock = stock;
        this.unitPrice = unitPrice;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
