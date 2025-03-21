package Factory;

public class Airline implements TransportCompany {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
