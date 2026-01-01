import java.util.Scanner;

public class alıştırma5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;

        // Geçerli bir sonuç alınana kadar döngü devam eder (Week 4: Iteration Statements)
        while (!success) {
            try {
                // 1. Kullanıcıdan sayıları alma (Week 3: Console input)
                System.out.print("Birinci sayıyı giriniz: ");
                double num1 = Double.parseDouble(scanner.next());

                System.out.print("İkinci sayıyı giriniz: ");
                double num2 = Double.parseDouble(scanner.next());

                // 2. İşlem türünü alma
                System.out.print("İşlemi giriniz (+, -, *, /): ");
                String operation = scanner.next();

                double result = 0;

                // 3. İşlem seçimi (Week 4: Selection Statements)
                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        // Sıfıra bölme kontrolü (Week 5: ArithmeticException)
                        if (num2 == 0) {
                            throw new ArithmeticException("Sıfıra bölme hatası!");
                        }
                        result = num1 / num2;
                        break;
                    default:
                        // Geçersiz operatör kontrolü (Week 4: Relational/Logical operators)
                        throw new IllegalArgumentException("Geçersiz işlem türü: " + operation);
                }

                System.out.println("Sonuç: " + result);
                success = true; // Program başarıyla tamamlandı, döngüden çık

            } catch (NumberFormatException e) {
                // Sayısal olmayan giriş hatası (Week 3: Data types)
                System.out.println("Hata: Lütfen geçerli bir sayısal değer giriniz.");
            } catch (IllegalArgumentException e) {
                // Geçersiz operatör hatası
                System.out.println("Hata: " + e.getMessage());
            } catch (ArithmeticException e) {
                // Matematiksel hata (Week 5: ArithmeticException)
                System.out.println("Hata: " + e.getMessage());
            } catch (Exception e) {
                // Diğer tüm beklenmedik hatalar (Week 5: Throwable/Exception hierarchy)
                System.out.println("Beklenmedik bir hata oluştu: " + e.getMessage());
            }
        }
        scanner.close();
    }
}