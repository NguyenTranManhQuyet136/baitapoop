import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<Product> products;


    public Order(String customerName) {
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {
        double sum = 0;
        for (int i=0; i < products.size(); i++) {
            sum += products.get(i).getPrice();
        }
        return sum;
    }

    public void checkout(String paymentType) {
        PaymentMethod pm = new PaymentMethod();
        double total = this.getTotal();


        switch (paymentType.toLowerCase()) {
            case "cash":
                pm.payCash(customerName, total);
                break;
            case "credit":
                pm.payCreditCard(customerName, total);
                break;
            case "momo":
                pm.payMomoPayment(customerName, total);
                break;
        }
    }
}
