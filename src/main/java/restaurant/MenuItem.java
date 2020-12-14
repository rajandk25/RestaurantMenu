package restaurant;

import java.time.LocalDate;
import java.util.Objects;

public class MenuItem {

    private double price;
    private String category;
    private String description;
    private LocalDate creationDate;

    public MenuItem(String category, String description, double price, LocalDate date){
        this.price = price;
        this.category = category;
        this.description = description;
        this.creationDate = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                category.equals(menuItem.category) &&
                description.equals(menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, category, description);
    }

    @Override
    public String toString() {
        return "Menu Item = " +
                "Price: " + price +
                ", Category: " + category +
                ", Description: " + description +
                ", Creation Date: " + creationDate;
    }
}
