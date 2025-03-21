package Singleton;

public class Main_Singleton {
    public static void main(String[] args) {
        // Lấy instance đầu tiên
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();

        // Lấy instance thứ hai
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.disconnect();

        // Kiểm tra hai instance có cùng địa chỉ không
        if (db1 == db2) {
            System.out.println("Cả hai đều là cùng một instance!");
        } else {
            System.out.println("Lỗi! Có nhiều hơn một instance.");
        }
    }
}
