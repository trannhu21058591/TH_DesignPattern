package BT1.Decorator;

public class BasicOrder implements Order {
    @Override
    public void process() {
        System.out.println("Xử lý đơn hàng cơ bản.");
    }
}
