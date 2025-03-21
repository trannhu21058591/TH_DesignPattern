package BT1.Strategy;

public class MainBT1_Strategy {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        // Mới tạo
        order.setStrategy(new NewOrderStrategy());
        order.processOrder();

        // Đang xử lý
        order.setStrategy(new ProcessingOrderStrategy());
        order.processOrder();

        // Đã giao
        order.setStrategy(new DeliveredOrderStrategy());
        order.processOrder();

        // Hủy đơn hàng
        order.setStrategy(new CancelledOrderStrategy());
        order.processOrder();
    }
}
