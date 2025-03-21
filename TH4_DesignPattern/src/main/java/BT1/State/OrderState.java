package BT1.State;

public interface OrderState {
    void handleRequest(OrderContext context);
    String getStateName();
}
