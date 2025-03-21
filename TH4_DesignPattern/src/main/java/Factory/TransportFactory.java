package Factory;

public class TransportFactory {
    public static Transport createTransport(String type) {
        if (type.equalsIgnoreCase("Bus")) {
            return new Bus();
        } else if (type.equalsIgnoreCase("Train")) {
            return new Train();
        } else if (type.equalsIgnoreCase("Plane")) {
            return new Plane();
        }
        throw new IllegalArgumentException("Loại phương tiện không hợp lệ!");
    }
}
