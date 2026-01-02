class Calc {
    // Method Overloading (Week 4)
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

class SmartCalc extends Calc {
    @Override
    int add(int a, int b) { 
        // Üst sınıftaki sonucun 2 katını döndürür
        return super.add(a, b) * 2; 
    }

    public static void main(String[] args) {
        Calc c = new SmartCalc(); // Polimorfik referans
        System.out.println("Add(2,3): " + c.add(2, 3));       // 10 döner (Overridden)
        System.out.println("Add(2.5,3.5): " + c.add(2.5, 3.5)); // 6.0 döner (Inherited)
    }
}