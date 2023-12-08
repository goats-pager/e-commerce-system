import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String customerName;
    private List<Order> orders;

    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Getter and setter methods

    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orders=" + orders +
                '}';
    }
}
