package BT2.State;

public class Product {
    private String name;
    private double price;
    private TaxState taxState; // Trạng thái thuế hiện tại

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        updateTaxState(); // Tự động chọn thuế dựa trên giá
    }

    // Phương thức cập nhật trạng thái thuế
    private void updateTaxState() {
        if (price > 10000) {
            this.taxState = new LuxuryTax(); // Nếu giá > 10,000, áp dụng thuế xa xỉ
        } else if (price > 1000) {
            this.taxState = new VATTax(); // Nếu giá > 1,000, áp dụng VAT
        } else {
            this.taxState = new ConsumptionTax(); // Nếu giá <= 1,000, áp dụng thuế tiêu thụ
        }
    }

    // Cập nhật giá và tự động đổi thuế
    public void setPrice(double newPrice) {
        this.price = newPrice;
        updateTaxState(); // Gọi để cập nhật thuế
    }

    public double getTaxAmount() {
        return taxState.calculateTax(price);
    }

    public double getTotalPrice() {
        return price + getTaxAmount();
    }

    public void displayInfo() {
        System.out.println("Sản phẩm: " + name);
        System.out.println("Giá gốc: " + price);
        System.out.println("Loại thuế: " + taxState.getClass().getSimpleName());
        System.out.println("Thuế: " + getTaxAmount());
        System.out.println("Tổng giá: " + getTotalPrice());
        System.out.println("----------------------");
    }
}
