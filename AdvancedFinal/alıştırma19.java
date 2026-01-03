// Printable arayüzü
interface Printable {
    void print(String content);
}

// Scannable arayüzü
interface Scannable {
    String scan();
}

// Çok fonksiyonlu yazıcı sınıfı
class MultiFunctionPrinter implements Printable, Scannable {

    @Override
    public void print(String content) {
        System.out.println("Yazdırılıyor: " + content);
    }

    @Override
    public String scan() {
        long time = System.currentTimeMillis();
        String result = "Taranan belge #" + time;
        System.out.println(result);
        return result;
    }

    // Yazıcının durumunu gösteren yardımcı metot
    public void status() {
        System.out.println("Durum: Hazır");
    }
}

// Main sınıfı
public class alıştırma19 {
    public static void main(String[] args) {

        MultiFunctionPrinter printer = new MultiFunctionPrinter();

        printer.status();
        printer.print("Java Interface Örneği");
        String scanResult = printer.scan();

        System.out.println("Scan sonucu: " + scanResult);
    }
}
