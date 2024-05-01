package com.example.kita_kita.data;

public class Category {
    private int categoryID;
    private int businessID;
    private String categoryName;

    public Category() {

    }

    public Category(int categoryID, int businessID, String categoryName) {
        this.categoryID = categoryID;
        this.businessID = businessID;
        this.categoryName = categoryName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getBusinessID() {
        return businessID;
    }

    public void setBusinessID(int businessID) {
        this.businessID = businessID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
