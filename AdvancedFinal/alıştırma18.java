// Notifier arayüzü
interface Notifier {
    void send(String msg);
}

// Email bildirimi gönderen sınıf
class EmailNotifier implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("E-posta gönderildi: " + msg);
    }
}

// SMS bildirimi gönderen sınıf
class SmsNotifier implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("SMS gönderildi: " + msg);
    }
}

// Runtime'da bildirim tipini seçen örnek kullanım
public class alıştırma18 {
    public static void main(String[] args) {

        Notifier notifier;

        boolean useEmail = true; // runtime koşulu

        if (useEmail) {
            notifier = new EmailNotifier();
        } else {
            notifier = new SmsNotifier();
        }

        notifier.send("Sistem bakımı tamamlandı.");
    }
}
