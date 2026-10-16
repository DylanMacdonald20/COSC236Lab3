package restaurant;
// MenuItem class
public class MenuItem {
    private String name;
    //Changed name from price to priceInDollars
    private double priceInDollars;

    public MenuItem(String name, double price) {
        this.name = name;
        this.priceInDollars = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return priceInDollars;
    }
}
