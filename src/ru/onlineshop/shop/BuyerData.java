package ru.onlineshop.shop;

public class BuyerData
{
    private final int id;
    private final String name;
    private final String email;
    private final String address;

    public BuyerData(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
}
