package BT2.State;

public class LuxuryTax implements TaxState{
    @Override
    public double calculateTax(double price) {
        return price * 0.2; // Thuế xa xỉ 20%
    }
}
