import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * OrderPlacing
 */
class OrderPlacing {
    double price;
    int quantity;
    int orderId;

    public OrderPlacing(double price, int quantity, int orderId) {
        this.price = price;
        this.quantity = quantity;
        this.orderId = orderId;
    }

}

public class FilterWithStream {
    public static void main(String[] args) {
        List<OrderPlacing> listOfOrder = new ArrayList<OrderPlacing>();
        listOfOrder.add(new OrderPlacing(800.00, 5, 1));
        listOfOrder.add(new OrderPlacing(1000.00, 3, 2));
        listOfOrder.add(new OrderPlacing(400.00, 7, 3));
        listOfOrder.add(new OrderPlacing(200.00, 8, 4));
        List<Double> orderPriceList = listOfOrder.stream().filter(p -> p.price > 500).map(p -> p.price)
                .collect(Collectors.toList());
        System.out.println("List of orderPrice are: " + orderPriceList);

    }
}
