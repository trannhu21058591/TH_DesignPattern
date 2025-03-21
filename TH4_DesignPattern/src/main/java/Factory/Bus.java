package Factory;

public class Bus implements Transport{
    @Override
    public void bookTicket() {
        System.out.println("Đặt vé xe buýt thành công!");
    }
}
