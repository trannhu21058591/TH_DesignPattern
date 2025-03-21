package Factory;

public class Main_Factory {
    public static void main(String[] args) {
        //Factory Method
        Transport bus = TransportFactory.createTransport("Bus");
        bus.bookTicket();

        Transport train = TransportFactory.createTransport("Train");
        train.bookTicket();

        Transport plane = TransportFactory.createTransport("Plane");
        plane.bookTicket();

        // Abstract Factory
        TransportCompany busCompany = new BusCompany();
        Transport busFromCompany = busCompany.createTransport();
        busFromCompany.bookTicket();

        TransportCompany trainCompany = new TrainCompany();
        Transport trainFromCompany = trainCompany.createTransport();
        trainFromCompany.bookTicket();

        TransportCompany airline = new Airline();
        Transport planeFromCompany = airline.createTransport();
        planeFromCompany.bookTicket();
    }
}
