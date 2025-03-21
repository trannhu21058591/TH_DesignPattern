package BT1.Strategy;

public class DeliveredOrderStrategy implements OrderStrategy {
    @Override
    public void processOrder() {
        System.out.println("Cập nhật trạng thái đơn hàng là Đã giao.");
    }
}
