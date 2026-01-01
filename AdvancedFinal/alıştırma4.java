// Üst Sınıf (Superclass)
class Shape {
    // Tüm şekiller için ortak bir arayüz tanımlar
    public double area() {
        return 0; // Varsayılan değer
    }
}

// Daire (Circle) Alt Sınıfı
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Üst sınıftaki metodu kendi formülüne göre ezer (Override)
    @Override
    public double area() {
        return Math.PI * radius * radius; // π * r²
    }
}

// Dikdörtgen (Rectangle) Alt Sınıfı
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Üst sınıftaki metodu dikdörtgen formülüne göre ezer
    @Override
    public double area() {
        return width * height; // Genişlik * Yükseklik
    }
}

// Ana Program
public class alıştırma4 {
    public static void main(String[] args) {
        // Polimorfik referans kullanımı: Üst sınıf tipi, alt sınıf nesnesini tutuyor
        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(4.0, 6.0);

        // Hangi metodun çağrılacağı nesne tipine göre belirlenir
        System.out.println("Dairenin Alanı: " + s1.area());
        System.out.println("Dikdörtgenin Alanı: " + s2.area());
    }
}