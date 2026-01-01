// Araba (Car) sınıfı tanımı
class Car {
    // Nesne değişkenleri 
    String brand;
    String model;
    int speed;

    // Constructor (Yapıcı Metot) - Nesne oluşturulduğunda ilk ayarları yapar [cite: 615, 618]
    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    // Hız artırma metodu [cite: 646, 121]
    void accelerate() {
        speed += 10; // Hızı 10 artırır [cite: 460]
    }

    // Hız azaltma metodu
    void brake() {
        if (speed >= 10) {
            speed -= 10; // Hızı 10 azaltır [cite: 460]
        } else {
            speed = 0;
        }
    }

    // Araba bilgilerini görüntüleme metodu [cite: 120]
    void displayInfo() {
        System.out.println("--- Araba Bilgileri ---");
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Mevcut Hız: " + speed + " km/h");
    }
}

// Ana program sınıfı [cite: 551]
public class alıştırma1 {
    public static void main(String[] args) {
        // Car sınıfından yeni bir nesne (instance) oluşturma [cite: 573, 149]
        Car myCar = new Car("Tesla", "Model S", 80);

        // Başlangıç bilgilerini yazdır [cite: 555]
        myCar.displayInfo();

        // Hızı artır
        System.out.println("\nHızlanılıyor...");
        myCar.accelerate();
        myCar.displayInfo();

        // Fren yap
        System.out.println("\nFren yapılıyor...");
        myCar.brake();
        myCar.displayInfo();
    }
}