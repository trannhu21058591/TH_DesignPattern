package Factory;

public class Plane implements Transport{

    @Override
    public void bookTicket() {
        System.out.println("Đặt vé máy bay thành công!");
    }
}
