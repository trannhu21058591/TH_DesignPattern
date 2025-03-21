package BT1.Decorator;

public class MainBT1_Decorator {
    public static void main(String[] args) {
        System.out.println("== Đơn hàng mới ==");
        Order newOrder = new CheckOrderDecorator(new BasicOrder());
        newOrder.process();

        System.out.println("\n== Đơn hàng đang xử lý ==");
        Order processingOrder = new PackOrderDecorator(new CheckOrderDecorator(new BasicOrder()));
        processingOrder.process();

        System.out.println("\n== Đơn hàng đã giao ==");
        Order deliveredOrder = new ShipOrderDecorator(new PackOrderDecorator(new CheckOrderDecorator(new BasicOrder())));
        deliveredOrder.process();

        System.out.println("\n== Đơn hàng bị hủy ==");
        Order cancelledOrder = new RefundOrderDecorator(new BasicOrder());
        cancelledOrder.process();
    }
}
