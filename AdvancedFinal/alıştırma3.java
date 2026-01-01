// Üst Sınıf (Superclass)
class Animal {
    // Tüm hayvanların ortak özelliği 
    void eat() {
        System.out.println("Hayvan yemek yiyor.");
    }
}

// Alt Sınıf 1 (Subclass) - Kuş bir hayvandır 
class Bird extends Animal {
    // Kuşa özgü davranış
    void fly() {
        System.out.println("Kuş uçuyor.");
    }
}

// Alt Sınıf 2 (Subclass) - Köpek bir hayvandır 
class Dog extends Animal {
    // Köpeğe özgü davranış 
    void bark() {
        System.out.println("Köpek havlıyor.");
    }
}

// Ana Program
public class alıştırma3 {
    public static void main(String[] args) {
        // Bir Bird nesnesi oluşturma
        Bird myBird = new Bird();
        System.out.println("--- Kuş İşlemleri ---");
        myBird.eat(); // Üst sınıftan miras alınan metot 
        myBird.fly(); // Kendi sınıfına ait metot

        // Bir Dog nesnesi oluşturma 
        Dog myDog = new Dog();
        System.out.println("\n--- Köpek İşlemleri ---");
        myDog.eat();  // Üst sınıftan miras alınan metot 
        myDog.bark(); // Kendi sınıfına ait metot
    }
}
