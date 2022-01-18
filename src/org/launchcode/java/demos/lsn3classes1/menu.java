package org.launchcode.java.demos.lsn3classes1;

public class menu {
    private Integer price;
    private String description;
    private String category;


    public menu(Integer price, String description , String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public void setDescription(String aDescription) {
        description = aDescription;

    }
}

