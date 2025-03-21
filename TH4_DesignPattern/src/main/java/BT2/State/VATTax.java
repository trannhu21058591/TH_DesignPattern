package BT2.State;

public class VATTax implements TaxState{
    @Override
    public double calculateTax(double price) {
        return price * 0.1; // Thuế VAT 10%
    }
}
