package Factory;

public class BusCompany implements TransportCompany {
    @Override
    public Transport createTransport() {
        return new Bus();
    }
}
