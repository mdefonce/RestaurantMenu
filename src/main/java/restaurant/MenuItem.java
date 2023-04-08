package restaurant;

import java.util.Objects;

public class MenuItem {

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
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public boolean getIsNew() { return isNew; }



    public String isNew() {
        if (this.isNew) {
            return "New Item!";
        }; return "Loved Staple";
    }

    public void printSingleItem(MenuItem item) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(this.name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

//    public boolean isEqual(MenuItem item) {
//
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) return true;
//        if (!(obj instanceof MenuItem)) { return false; }
//        MenuItem menuItem = (MenuItem) obj;
//        if (menuItem.name.equals(this.name)
//                && menuItem.description.equals(this.description)
//                && menuItem.price.equals(this.price)
//                && menuItem.category.equals(this.category)) {
//            return true;
//        } else { return false; }
//    }


    @Override
    public String toString() {
        return category + " - " + isNew() + '\n' +
                name + ": " + description + '\n' +
                "$" + price + '\n';
    }

}
