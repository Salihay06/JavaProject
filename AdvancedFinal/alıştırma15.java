class A {
    int i = 1;
    void who() { System.out.println("A.who, i=" + i); }
}

class B extends A {
    int i = 2; // Hiding
    @Override
    void who() { System.out.println("B.who, i=" + i); }
    
    void showBoth() {
        System.out.println("super.i=" + super.i + " / this.i=" + this.i);
        super.who();
        this.who();
    }

    public static void main(String[] args) {
        new B().showBoth();
    }
}