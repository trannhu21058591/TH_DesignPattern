package Factory;

public class Train implements Transport {
    @Override
    public void bookTicket() {
        System.out.println("Đặt vé tàu thành công!");
    }
}
