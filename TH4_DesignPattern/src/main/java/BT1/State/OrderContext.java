package BT1.State;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new NewOrderState(); // Mặc định trạng thái ban đầu
    }

    public void setState(OrderState state) {
        this.state = state;
        System.out.println("Trạng thái đơn hàng chuyển sang: " + state.getStateName());
    }

    public void processOrder() {
        state.handleRequest(this);
    }
}
