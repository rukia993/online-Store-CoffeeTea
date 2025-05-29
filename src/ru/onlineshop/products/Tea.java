package ru.onlineshop.products;

public class Tea extends Product
{
    private final String teaType;

    public Tea(String name, double price, int id, String description, String teaType) {
        super(name, price, id, description);
        this.teaType = teaType;
    }

    public String getTeaType()
    {
        return teaType;
    }
}
