package BT2.State;

public class MainBT2_State {
    public static void main(String[] args) {
        Product phone = new Product("Điện thoại", 1000);
        Product car = new Product("Xe hơi", 50000);
        Product food = new Product("Bánh mì", 20);

        phone.displayInfo();
        car.displayInfo();
        food.displayInfo();

        // Tăng giá điện thoại lên 2000 => tự đổi từ ConsumptionTax sang VATTax
        System.out.println("\nTăng giá điện thoại lên 2000...");
        phone.setPrice(2000);
        phone.displayInfo();

        // Tăng giá xe hơi lên 100000 => Vẫn giữ LuxuryTax
        System.out.println("\nTăng giá xe hơi lên 100000...");
        car.setPrice(100000);
        car.displayInfo();
    }
}
