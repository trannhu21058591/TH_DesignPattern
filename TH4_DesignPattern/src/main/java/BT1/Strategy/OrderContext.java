package BT1.Strategy;

public class OrderContext {
    private OrderStrategy strategy;

    public void setStrategy(OrderStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder() {
        if (strategy != null) {
            strategy.processOrder();
        } else {
            System.out.println("Vui lòng chọn chiến lược xử lý đơn hàng.");
        }
    }
}
