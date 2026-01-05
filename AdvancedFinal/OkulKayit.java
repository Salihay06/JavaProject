/*
Bir okula öğrenci kaydeden bir sistem yazıyoruz. Okul kurallarına göre 18 yaşından büyükler liseye kaydedilemez.

Sorun: Sisteme 25 yaşında birini lise öğrencisi olarak kaydetmeye çalışmak.

İşçi (kayitOl): Yaşı kontrol eder. Eğer yaş 18'den büyükse "Yaş Sınırı Hatası" fırlatır.

Patron (main): Kayıt formunu doldurur. Hata gelirse "Kaydınız yapılamadı" der.
*/

public class OkulKayit {
    static void kayitOl(String isim , int yas) throws Exception {
        if(yas>18){
            throw new Exception("Yaş Sınırı Hatası: Lise öğrencisi için yaş 18'den büyük olamaz.");
        }
         System.out.println("Kayıt başarılı: " + isim + ", Yaş: " + yas);
    }

    public static void main(String[] args) {
        try {
            kayitOl("Ahmet", 25);
        } catch (Exception e) {
            System.out.println("Kaydınız yapılamadı: " + e.getMessage());
        }
    }
}
