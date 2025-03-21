package BT1.Decorator;

public class RefundOrderDecorator extends OrderDecorator{
    public RefundOrderDecorator(Order order) {
        super(order);
    }
    public void process() {
        super.process();
        refundOrder();
    }

    private void refundOrder() {
        System.out.println("Hoàn tiền cho khách hàng...");
    }
}
