package restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MenuItem {


//    { MenuItem pretzels = new MenuItem("Pretzel Bites", "Handcrafted, soft pretzels with Wisconsin beer cheese", "Appetizer", 9.50, false);}

        private String name;
        private String description;
        private String category;
        private double price;
        private boolean isNew;


        public MenuItem(String aName, String aDescription, String aCategory, double aPrice, boolean aIsNew) {
            this.name = aName;
            this.description = aDescription;
            this.category = aCategory;
            this.price = aPrice;
            this.isNew = aIsNew;
        }

        public MenuItem(String name) {this.name = name;}

    public void setName(String name) {this.name = name;}
    public void setDescription(String description) {this.description = description;}
    public void setCategory(String category) {
        this.category = category;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setNew(boolean isNNew) {
        this.isNew = isNew;
    }
    public String getName() { return name;}
    public String getDescription() { return description;}
    public String getCategory() { return category;}
    public double getPrice() { return price;}
    public boolean getNew() { return isNew;}



}
