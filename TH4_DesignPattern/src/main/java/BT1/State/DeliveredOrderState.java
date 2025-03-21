package BT1.State;

public class DeliveredOrderState implements OrderState{
    @Override
    public void handleRequest(OrderContext context) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }

    @Override
    public String getStateName() {
        return "Đã giao";
    }
}
