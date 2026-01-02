class Payment {
    void pay(double amount) { System.out.println("Ödeme yapılıyor: " + amount); }
}

class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) { System.out.println("Kredi kartı ile " + amount + " TL ödendi."); }
}

class PayPalPayment extends Payment {
    @Override
    void pay(double amount) { System.out.println("PayPal ile " + amount + " TL ödendi."); }
}

class Checkout {
    static void process(Payment p, double amount) {
        p.pay(amount);
    }
}

public class alıştırma14 {
    public static void main(String[] args) {
        CreditCardPayment cc = new CreditCardPayment();
        PayPalPayment pp = new PayPalPayment();

        Checkout.process(cc, 150.0);
        Checkout.process(pp, 99.9);
    }
}





