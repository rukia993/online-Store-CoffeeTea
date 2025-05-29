package ru.onlineshop.order;

import ru.onlineshop.buyer.BuyerData;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    private final int id;
    private final BuyerData buyerData;
    private final List<OrderItem> items = new ArrayList<>();
    private final String status;
    private double totalPrice;

    public Order(int id, BuyerData buyerData, String status) {
        this.id = id;
        this.buyerData = buyerData;
        this.status = status;
    }

    public int getId() { return id; }
    public BuyerData getBuyerData() {return buyerData;}
    public List<OrderItem> getItems() { return items; }
    public String getStatus() { return status; }
    public double getTotalPrice() { return totalPrice; }

    public void addItem(OrderItem item) {
        items.add(item);
        totalPrice += item.getPrice() * item.getQuantity();
    }
}
