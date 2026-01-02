class Animal {
    void eat() { System.out.println("Animal eats"); }
}

class Bird extends Animal { // Kalıtım [cite: 773, 887]
    @Override
    void eat() { System.out.println("Bird pecks seeds"); } // Overriding [cite: 808, 943]
    
    void fly() { System.out.println("Bird flies"); }
}

public class alıştırma12 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        
        // Polimorfizm: Üst sınıf referansı, alt sınıf nesnesi [cite: 1200, 1202]
        Animal b = new Bird(); 
        b.eat(); // Bird pecks seeds yazdırır (Dinamik bağlama) [cite: 1203]
        
        // Downcasting: Referansı alt sınıfa geri dönüştürme [cite: 514]
        Bird c = (Bird) b; 
        c.fly();
    }
}