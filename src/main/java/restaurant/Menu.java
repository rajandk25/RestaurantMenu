package restaurant;

import java.time.LocalDate;
import java.util.*;

public class Menu {

    ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
    }

    public boolean isNewMenuItem(MenuItem menuItem) {
        return menuItem.getCreationDate().isAfter(LocalDate.now().minusDays(30));
    }

    public LocalDate lastUpdatedAt() {
        LocalDate lastUpdatedAt = menuItems.get(0).getCreationDate();

        for (MenuItem menuItem : menuItems) {
            if (menuItem.getCreationDate().isAfter(lastUpdatedAt)) {
                lastUpdatedAt = menuItem.getCreationDate();
            }
        }

        return lastUpdatedAt;
    }

    public void printMenuItems() {
        for (MenuItem menuItem: menuItems) {
            System.out.println(menuItem);
        }
    }

    public void printMenu() {
        final Map<String, List> menuMap = new HashMap<>();

        for (MenuItem menuItem: menuItems) {
            if(!menuMap.containsKey(menuItem.getCategory())){
                List<String> descriptionList = new ArrayList<>();
                descriptionList.add(menuItem.getDescription());

                menuMap.put(menuItem.getCategory(), descriptionList);
            }
            else{
                List<String> descriptionList = menuMap.get(menuItem.getCategory());
                descriptionList.add(menuItem.getDescription());
            }
        }

        //print the map
        for(Map.Entry<String, List> entry : menuMap.entrySet()){
            System.out.println(entry.getKey() + " -----> "+ entry.getValue());
        }
    }

    public boolean areMenuItemsEqual(MenuItem m1, MenuItem m2) {
        return m1.equals(m2);
    }


}
