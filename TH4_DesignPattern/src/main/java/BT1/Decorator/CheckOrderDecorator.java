package BT1.Decorator;

public class CheckOrderDecorator extends OrderDecorator{
    public CheckOrderDecorator(Order order) {
        super(order);
    }
    public void process() {
        super.process();
        checkOrderInfo();
    }

    private void checkOrderInfo() {
        System.out.println("Kiểm tra thông tin đơn hàng...");
    }
}
