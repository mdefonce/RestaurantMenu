package restaurant;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem pretzels = new MenuItem("Pretzel Bites", "Handcrafted, soft pretzels with Wisconsin beer cheese", "Appetizer", 9.50, false);

        MenuItem bbqBaconCheddarBurger = new MenuItem("BBQ Bacon Cheddar Burger", "Smoked bacon covered in our signature BBQ sauce layered with Wisconsin cheddar atop a bison burger pattie.", "Entre", 15.99, true);

        MenuItem frontPorchSwing = new MenuItem("Front Porch Swing Lemonade", "House-made freshly-squeezed lemonade with a splash of Tito's", "Drink", 7.50, false);

        MenuItem skilletCookie = new MenuItem("Cookie in a Skillet", "Gooey chocolate chip cookie baked in a cast iron skillet topped with your choice of home-churned ice cream", "Dessert", 9.99, false);

        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(pretzels);
        items.add(bbqBaconCheddarBurger);
        items.add(frontPorchSwing);
        items.add(skilletCookie);

        Menu newMenu = new Menu(items);

        newMenu.printMenu();


    }

}
