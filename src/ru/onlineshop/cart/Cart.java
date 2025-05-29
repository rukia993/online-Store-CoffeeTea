package ru.onlineshop.cart;

import ru.onlineshop.buyer.BuyerData;

import java.util.ArrayList;
import java.util.List;

public class Cart
{
    private final BuyerData buyerData;
    private final List<CartItem> items = new ArrayList<>();

    public Cart(BuyerData buyerData) {
        this.buyerData = buyerData;
    }

    public BuyerData getBuyerData() { return buyerData; }
    public List<CartItem> getItems() { return items; }

    public void addItem(CartItem item) {
        items.add(item);
    }

}
