package ru.onlineshop.payment;

import ru.onlineshop.order.Order;

public class Payment
{
    private final int id;
    private final Order order;
    private final double amount;
    private final String status;

    public Payment(int id, Order order, double amount, String status) {
        this.id = id;
        this.order = order;
        this.amount = order.getTotalPrice();
        this.status = status;
    }

    public int getId() { return id; }
    public Order getOrder() { return order; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Платёж №" + id + " на сумму " + amount + " руб. Статус: " + status;
    }
}
