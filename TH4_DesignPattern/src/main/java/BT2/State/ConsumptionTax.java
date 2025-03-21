package BT2.State;

public class ConsumptionTax implements TaxState{
    @Override
    public double calculateTax(double price) {
        return price * 0.02; // Thuế tiêu thụ 2%
    }
}
