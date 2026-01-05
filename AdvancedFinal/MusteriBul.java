
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory;

public class MusteriBul {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/sirket_db";
        String kadi="root";
        String parola="password";

        Connection baglanti = null;
        PreparedStatement ifade = null;
        ResultSet sonuc = null;
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            baglanti =DriverManager.getConnection(url, kadi, parola);
            System.err.println("Lütfen müsteri ID'si giriniz:");
            
            int musteriId = scanner.nextInt();

            String sql = "SELECT * FROM musteriler WHERE id = ?";
            ifade = baglanti.prepareStatement(sql);
            ifade.setInt(1, musteriId);
            sonuc = ifade.executeQuery();
            if (sonuc.next()) {
                String isim = sonuc.getString("name");
                String email = sonuc.getString("email");
                String adres = sonuc.getString("address");

                System.out.println("\n--- Müşteri Bulundu ---");
                System.out.println("İsim: " + isim);
                System.out.println("E-posta: " + email);
                System.out.println("Adres: " + adres);
            } else {
                // Eğer rs.next() false ise kayıt yok demektir.
                System.out.println("\nSONUÇ: Girdiğiniz ID (" + musteriId + ") ile eşleşen müşteri bulunamadı (not found).");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Hata: MySQL Sürücüsü bulunamadı!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Hata: Veritabanı bağlantısı veya sorgu hatası!");
            e.printStackTrace();
        } finally {
            // 7. ADIM: Kaynakları Kapat (Bellek sızıntısını önlemek için)
            try {
                if (sonuc != null) sonuc.close();
                if (ifade != null) ifade.close();
                if (baglanti != null) baglanti.close();
                scanner.close();
                System.out.println("Bağlantı kapatıldı.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
     }
    }
