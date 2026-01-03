// Shape arayüzü
interface Shape {
    void draw();
}

// Circle sınıfı
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Daire çiziliyor");
    }
}

// Rectangle sınıfı
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Dikdörtgen çiziliyor");
    }
}



// ShapeFactory sınıfı
class ShapeFactory {

    public static Shape create(String type) {
        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            // case "triangle":
            //     return new Triangle();
            default:
                throw new IllegalArgumentException("Geçersiz şekil tipi: " + type);
        }
    }
}

// Main sınıfı
public class alıştırma22 {
    public static void main(String[] args) {

        Shape s1 = ShapeFactory.create("circle");
        Shape s2 = ShapeFactory.create("rectangle");

        s1.draw();
        s2.draw();
    }
}
