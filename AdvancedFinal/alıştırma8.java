import java.util.Scanner;

public class alıştırma8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç adet ders aldınız? ");
        int dersSayisi = scanner.nextInt();
        float toplamNot = 0.0f; // float veri tipi [cite: 298]
        
        for (int i = 1; i <= dersSayisi; i++) {
            System.out.print(i + ". dersin notu: ");
            toplamNot += scanner.nextFloat();
        }
        
        float ortalama = toplamNot / dersSayisi;
        int tamSayiOrtalama = (int) ortalama; // Daraltma dönüşümü (Casting) [cite: 515, 548]
        
        System.out.println("Not Ortalamanız (Tam Sayı): " + tamSayiOrtalama);
        
        if (tamSayiOrtalama >= 90) {
            System.out.println("Mükemmel!");
        } else if (tamSayiOrtalama >= 70) {
            System.out.println("Başarılı.");
        } else {
            System.out.println("Daha çok çalışmalısın!");
        }
    }
}