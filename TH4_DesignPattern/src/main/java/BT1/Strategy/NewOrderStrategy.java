package BT1.Strategy;

public class NewOrderStrategy implements OrderStrategy {

    @Override
    public void processOrder() {
        System.out.println("Kiểm tra thông tin đơn hàng...");
    }
}
