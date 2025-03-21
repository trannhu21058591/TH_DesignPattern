package Singleton;

public class DatabaseConnection {
    // Biến static lưu instance duy nhất
    private static DatabaseConnection instance;

    // Constructor private để ngăn tạo instance từ bên ngoài
    private DatabaseConnection() {
        System.out.println("Kết nối cơ sở dữ liệu được tạo.");
    }

    // Phương thức getInstance đảm bảo chỉ có một instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Phương thức mô phỏng kết nối
    public void connect() {
        System.out.println("Đã kết nối tới cơ sở dữ liệu.");
    }

    // Phương thức mô phỏng ngắt kết nối
    public void disconnect() {
        System.out.println("Đã ngắt kết nối.");
    }
}
