// A arayüzü
interface A {
    void m1();
}

// B arayüzü (A'yı genişletir)
interface B extends A {
    void m2();
}

// B arayüzünü uygulayan sınıf
class MyClass implements B {

    @Override
    public void m1() {
        System.out.println("m1 metodu çalıştı (A arayüzünden)");
    }

    @Override
    public void m2() {
        System.out.println("m2 metodu çalıştı (B arayüzünden)");
    }
}

// Main sınıfı
public class alıştırma20 {
    public static void main(String[] args) {

        B obj = new MyClass(); // Polymorphism

        obj.m1();
        obj.m2();
    }
}
