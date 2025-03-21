package BT1.State;

public class ProcessingOrderState implements OrderState{
    @Override
    public void handleRequest(OrderContext context) {
        System.out.println("Đóng gói và vận chuyển...");
        context.setState(new DeliveredOrderState()); // Chuyển sang trạng thái Đã giao
    }

    @Override
    public String getStateName() {
        return "Đang xử lý";
    }
}
