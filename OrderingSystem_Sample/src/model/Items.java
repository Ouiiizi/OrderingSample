package model;

public class Items extends Category {
    public String name;
    public double price;
    public Items(String name, double price) {
        super(name);
        this.name = name;
        this.price = price;
    }
}
