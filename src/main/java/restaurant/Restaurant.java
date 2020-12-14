package restaurant;

import java.time.LocalDate;

public class Restaurant {
    public static void main(String[] args) {
        final Menu menu = new Menu();
        final LocalDate now = LocalDate.now();
        final MenuItem m1 = new MenuItem("Appetizer", "Sweet & Spicy jalapeno poppers", 6.50, now.minusDays(40));
        final MenuItem m2 = new MenuItem("Appetizer", "Chili Meatballs", 7.0, now.minusDays(40));
        final MenuItem m3 = new MenuItem("Entree", "Grilled Rib Chop", 25.0, now.minusDays(20));
        final MenuItem m4 = new MenuItem("Entree", "Special Shrimp Stir Fry", 22.0, LocalDate.now());
        final MenuItem m5 = new MenuItem("Dessert", "Boston cream pie", 9.25, LocalDate.now());
        final MenuItem m6 = new MenuItem("Dessert", "Butterscotch pudding", 9.25, LocalDate.now());

        menu.addMenuItem(m1);
        menu.addMenuItem(m2);
        menu.addMenuItem(m3);
        menu.addMenuItem(m4);
        menu.addMenuItem(m5);
        menu.addMenuItem(m6);

        menu.printMenuItems();
        menu.printMenu();
    }
}
