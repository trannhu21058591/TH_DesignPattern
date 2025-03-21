package BT1.Decorator;

public class PackOrderDecorator extends OrderDecorator{
    public PackOrderDecorator(Order order) {
        super(order);
    }

    public void process() {
        super.process();
        packOrder();
    }

    private void packOrder() {
        System.out.println("Đóng gói đơn hàng...");
    }
}
