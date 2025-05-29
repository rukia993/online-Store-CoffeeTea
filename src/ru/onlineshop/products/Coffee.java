package ru.onlineshop.products;

public class Coffee extends Product
{
    private final String coffeeType;

    public Coffee(String name, double price, int id, String description, String coffeeType)
    {
        super(name, price, id, description);
        this.coffeeType = coffeeType;
    }

    public String getCoffeeType()
    {
        return coffeeType;
    }
}
