class Box {
    double width, height, depth; // Örnek değişkenler [cite: 594]

    // Parametresiz constructor [cite: 614, 620]
    Box() {
        width = 10; height = 10; depth = 10;
        System.out.println("Parametresiz constructor çağrıldı!");
    }

    // Parametreli constructor [cite: 633, 638]
    Box(double w, double h, double d) {
        width = w; height = h; depth = d;
        System.out.println("Parametreli constructor çağrıldı!");
    }

    double volume() { // Hacim hesaplama [cite: 630]
        return width * height * depth;
    }
}

public class alıştırma11 {
    public static void main(String[] args) {
        Box b1 = new Box(); // Varsayılan değerlerle nesne [cite: 607]
        Box b2 = new Box(5, 10, 2); // Dışarıdan alınan değerlerle nesne
        
        System.out.println("B1 Hacmi: " + b1.volume());
        System.out.println("B2 Hacmi: " + b2.volume());
    }
}