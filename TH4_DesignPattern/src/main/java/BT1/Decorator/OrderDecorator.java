package BT1.Decorator;

public abstract class OrderDecorator implements Order {
    protected Order decoratedOrder;

    public OrderDecorator(Order order) {
        this.decoratedOrder = order;
    }

    public void process() {
        decoratedOrder.process();
    }
}

// class này dùng để mở rộng hành vi đơn hàng