package Factory;

public class TrainCompany implements TransportCompany {
    @Override
    public Transport createTransport() {
        return new Train();
    }
}
