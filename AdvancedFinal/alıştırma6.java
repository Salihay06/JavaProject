import java.util.Scanner;

public class alıştırma6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Konsol girişi için [cite: 8, 403]
        
        // 1. Kahve Tipi Seçimi [cite: 292, 345]
        System.out.println("Kahve Tipi Seçin (1=Espresso, 2=Latte, 3=Mocha): ");
        int coffeeChoice = scanner.nextInt();
        String coffeeName = (coffeeChoice == 1) ? "Espresso" : (coffeeChoice == 2) ? "Latte" : "Mocha";

        // 2. Boyut Seçimi ve Temel Fiyat Hesaplama [cite: 462, 485]
        System.out.println("Boyut Seçin (S, M, L): ");
        String size = scanner.next().toUpperCase();
        int price = 0;

        if (size.equals("S")) {
            price = 30;
        } else if (size.equals("M")) {
            price = 35;
        } else if (size.equals("L")) {
            price = 40;
        }

        // 3. Şeker İsteği [cite: 301, 341]
        System.out.println("Şeker ister misiniz? (E/H): ");
        String sugarChoice = scanner.next().toUpperCase();
        String sugarStatus = "Şekersiz";

        if (sugarChoice.equals("E")) {
            price += 2; // Şeker eklenirse +2 TL [cite: 460]
            sugarStatus = "Şekerli";
        }

        // 4. Sonuç Çıktısı [cite: 8, 555]
        String sizeFull = (size.equals("S")) ? "Small" : (size.equals("M")) ? "Medium" : "Large";
        System.out.println(coffeeName + " (" + sizeFull + ", " + sugarStatus + ") fiyatı: " + price + " TL");
        
        scanner.close();
    }
}