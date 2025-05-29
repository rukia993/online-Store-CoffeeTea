package ru.onlineshop.products;

public abstract class Product
{
    private final String name;
    private final double price;
    private final int id;
    private final String description;

    public Product(String name, double price, int id, String description) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.description = description;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getId() { return id; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return name + " (" + description + "), " + price + " руб.";
    }
}
