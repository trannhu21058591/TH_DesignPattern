package BT1.State;

public class CancelledOrderState implements OrderState{
    @Override
    public void handleRequest(OrderContext context) {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }

    @Override
    public String getStateName() {
        return "Huỷ";
    }
}
