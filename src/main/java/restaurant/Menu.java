package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public ArrayList<MenuItem> getItems() { return items; }
    public Date getLastUpdated() { return lastUpdated; }


    public void addItem(MenuItem newItem) {
        this.items.add(newItem);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem oldItem) {
        this.items.remove(oldItem);
        this.lastUpdated = new Date();
    }

    public void printMenu() {
        this.items.forEach((menuItem) -> System.out.println(menuItem.toString()) );
    }


}
