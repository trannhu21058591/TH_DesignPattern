package BT1.Strategy;

public class ProcessingOrderStrategy implements OrderStrategy {
    @Override
    public void processOrder() {
        System.out.println("Đóng gói và vận chuyển đơn hàng...");
    }
}
