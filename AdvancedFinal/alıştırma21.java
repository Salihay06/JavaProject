// Callback arayüzü
interface Callback {
    void callback(int p);
}

// Callback arayüzünü uygulayan Client sınıfı
class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("Callback tetiklendi, p=" + p);
    }

    // Arayüzde olmayan yardımcı metot
    public void helper() {
        System.out.println("Arayüzde olmayan yardımcı metot");
    }
}

// Main sınıfı
public class alıştırma21 {
    public static void main(String[] args) {

        Callback cb = new Client();
        cb.callback(42);

        // instanceof ile gerçek tip kontrolü
        if (cb instanceof Client) {
            Client client = (Client) cb;
            client.helper();
        }
    }
}
