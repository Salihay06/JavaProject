import java.util.Scanner;

public class alıştırma7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Konsol girişi için 

        System.out.print("Kilonuzu girin (kg): ");
        double kilo = input.nextDouble(); // double veri tipi kullanımı [cite: 299]

        System.out.print("Boyunuzu girin (metre, örn: 1.75): ");
        double boy = input.nextDouble();

        // Formül: kilo / (boy * boy) [cite: 458]
        double ks = kilo / (boy * boy);
        System.out.printf("Vücut Kitle Endeksiniz: %.2f\n", ks);

        // Durum belirleme (if-else-if hiyerarşisi) 
        if (ks < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (ks >= 18.5 && ks <= 24.9) { // Mantıksal AND kullanımı 
            System.out.println("Durum: Normal");
        } else if (ks >= 25 && ks <= 29.9) {
            System.out.println("Durum: Kilolu");
        } else {
            System.out.println("Durum: Obez");
        }
        
        input.close();
    }
}