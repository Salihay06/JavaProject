/*
Kahve Makinesi Senaryosu
Senaryo: Bir kahve makinesi kodluyoruz. Makinenin su tankı var. Eğer su bittiyse makine kahve yapamaz.

Sorun: Su yoksa kahve yapmaya çalışmak makineyi yakabilir.

İşçi (kahveYap): Suyu kontrol eder. Su yoksa "Su Bitti" diyerek işlemi durdurur ve hatayı fırlatır (throw). Metodun kapısına da "Dikkat bu makine su hatası verebilir" levhasını asar (throws).

Patron (main): Kahve yap tuşuna basar. Eğer hata gelirse kullanıcıya "Su ekleyin" mesajı gösterir.
*/



public class KahveDukkani {
    static void kahveyap(int suMiktari) throws Exception{
        if(suMiktari<100){
            throw new Exception("Yeterli su yok!");
        }
        System.out.println("Kahve yapılıyor...");
 
    }

public static void main(String[] args) {
    try {
        System.out.println("Kahve dükkanına hoşgeldiniz!");

    kahveyap(50);
    } catch (Exception e) {
        System.out.println("Hata: " + e.getMessage());
        System.out.println("Lütfen su ekleyiniz.");

    }
}
}
