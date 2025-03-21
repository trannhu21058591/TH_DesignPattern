package BT1.Decorator;

public class ShipOrderDecorator extends OrderDecorator{

    public ShipOrderDecorator(Order order) {
        super(order);
    }

    public void process() {
        super.process();
        shipOrder();
    }

    private void shipOrder() {
        System.out.println("Vận chuyển đơn hàng...");
    }
}
