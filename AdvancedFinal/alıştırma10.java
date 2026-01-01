import java.util.Scanner;

public class alıştırma10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cumle = scan.nextLine();
        
        // 1. Uzunluk [cite: 712]
        System.out.println("Uzunluk: " + cumle.length());
        
        // 2. Büyük/Küçük Harf
        System.out.println("Küçük: " + cumle.toLowerCase());
        System.out.println("Büyük: " + cumle.toUpperCase());
        
        // 3. İlk Karakter [cite: 713]
        System.out.println("İlk karakter: " + cumle.charAt(0));
        
        // 4. Java kelimesi kontrolü
        System.out.println("Java içeriyor mu? " + cumle.contains("Java"));
        
        // 5. Ünlem kontrolü
        if (cumle.endsWith("!")) System.out.println("Cümle ünlemle bitiyor.");
        
        // 6. Kelime değiştirme
        String yeniCumle = cumle.replace("zor", "eğlenceli");
        System.out.println("Yeni hali: " + yeniCumle);
        
        // 7. İlk 5 karakter (Uzunluk kontrolü ile)
        if (cumle.length() >= 5) {
            System.out.println("İlk 5 karakter: " + cumle.substring(0, 5));
        }
    }
}