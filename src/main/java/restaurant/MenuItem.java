package restaurant;

public class MenuItem {

    private double price;
    private String category;
    private String description;
    private String date;

    public MenuItem(double price, String category, String description, String date){
        this.price = price;
        this.category = category;
        this.description = description;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
