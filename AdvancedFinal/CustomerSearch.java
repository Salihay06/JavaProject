/*
JDBC kullanarak bir MySQL veritabanına bağlanan bir Java programı yazınız.
(MySQL Connector/J kütüphanesi gereklidir)

Bağlantı adresi:

jdbc:mysql://localhost:3306/your_database_name


Program:

Kullanıcıdan customer ID alsın

"customers" tablosundan müşterinin bilgilerini (isim, email, adres) çeksin

Müşteri yoksa "not found" mesajı göstersin
*/

import java.sql.*;
import java.util.Scanner;

public class CustomerSearch {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String user = "root";
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer ID girin: ");
        int id = scanner.nextInt();

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM customers WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Address: " + rs.getString("address"));
            } else {
                System.out.println("Customer not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
