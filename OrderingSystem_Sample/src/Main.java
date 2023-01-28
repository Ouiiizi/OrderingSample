import model.Orderer;
import model.Items;
import model.Orders;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Items> items = new ArrayList<>();
        items.add(new Items("Food I costs", 12.5));
        items.add(new Items("Food II costs", 15.0));
        Orders order = new Orders(items);
        List<Orders> orders = new ArrayList<>();
        orders.add(order);
        Orderer customer = new Orderer(orders);

        for (Items item : order.items) {
            System.out.println("Item name: " + item.name);
            System.out.println("Cost : " + item.price);
        }
        System.out.println("Total : " + order.getInvoice());


    }
}
