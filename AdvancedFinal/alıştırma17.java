abstract class Vehicle {
    String name;
    Vehicle(String name) { this.name = name; }
    abstract void move(); // Gövdesiz metot
}

class Car extends Vehicle {
    Car(String name) { super(name); }
    @Override
    void move() { System.out.println(name + " drives"); }

    public static void main(String[] args) {
        // Vehicle v = new Vehicle("Test"); // HATA: Nesne oluşturulamaz
        Vehicle myCar = new Car("Toyota");
        myCar.move();
    }
}