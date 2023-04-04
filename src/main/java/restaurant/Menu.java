package restaurant;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> items;
    private Date lastUpdated;

//    public Menu(ArrayList<>(), Date lastUpdated)


    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {return items;}
    public Date getLastUpdated() {return lastUpdated;}

}
