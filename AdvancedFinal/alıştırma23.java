import java.util.ArrayList;
import java.util.List;

// Shape arayüzü
interface Shape {
    double area();
}

// Rectangle sınıfı
class Rectangle implements Shape {
    double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }

    @Override
    public String toString() {
        return "Rectangle(" + w + "," + h + ")";
    }
}

// Circle sınıfı
class Circle implements Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Circle(" + r + ")";
    }
}

// ShapeFactory sınıfı
class ShapeFactory {

    public static Shape create(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Şekil tipi null olamaz");
        }

        switch (type.toLowerCase()) {
            case "rect":
            case "rectangle":
                return new Rectangle(3, 5);
            case "circle":
                return new Circle(2);
            default:
                throw new IllegalArgumentException("Geçersiz şekil tipi: " + type);
        }
    }
}

// Main sınıfı
public class alıştırma23 {
    public static void main(String[] args) {

        Shape s1 = ShapeFactory.create("rectangle");
        Shape s2 = ShapeFactory.create("circle");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(s1);
        shapes.add(s2);

        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println("Alan: " + s.area());
        }
    }
}
