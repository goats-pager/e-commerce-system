import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("P1", "Laptop", 999.99);
        Product phone = new Product("P2", "Smartphone", 499.99);

        Customer customer = new Customer("C1", "John Doe");

        Order order1 = new Order("O1", new Date());
        order1.addProduct(laptop);
        order1.addProduct(phone);

        customer.placeOrder(order1);

        System.out.println(customer);
    }
}
