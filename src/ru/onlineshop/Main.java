package ru.onlineshop;

import ru.onlineshop.order.OrderItem;
import ru.onlineshop.products.Coffee;
import ru.onlineshop.products.Product;
import ru.onlineshop.products.Tea;

public class Main
{
    public static void main(String[] args)
    {
        Product tess = new Tea("tess",200,1,"very nice tea","green");
        Product coffTess = new Coffee("coffTess",234.3,2,"very nice coffe","Cappuccino");

    }

}
