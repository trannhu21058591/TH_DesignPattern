package BT1.State;

public class MainBT1_State {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        // Chuyển trạng thái từ Mới tạo -> Đang xử lý -> Đã giao
        order.processOrder();
        order.processOrder();

        // Hủy đơn hàng (nếu chưa giao thì có thể hủy)
        order.setState(new CancelledOrderState());
        order.processOrder();
    }
}
