package Data;

public class Inventory {
    private int barcode;
    private int stock;
    private String dateAdded;
    private String expDate;
    private double unitPrice;
    private int categoryID;

    public Inventory() {

    }

    public Inventory(int barcode, int stock, String dateAdded, String expDate, double unitPrice, int categoryID) {
        this.barcode = barcode;
        this.stock = stock;
        this.dateAdded = dateAdded;
        this.expDate = expDate;
        this.unitPrice = unitPrice;
        this.categoryID = categoryID;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
}
