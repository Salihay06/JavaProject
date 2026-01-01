class BankAccount {
    // Kapsülleme (Encapsulation) kuralına göre veriler dışarıdan gizlendi 
    private String accountNumber; 
    private double balance; 

    // Kurucu metot (Constructor): Nesne oluşturulduğunda ilk değerleri atar [cite: 615, 618]
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber; 
        this.balance = initialBalance;
    }

    // Para yatırma metodu [cite: 13, 37]
    public void deposit(double amount) {
        if (amount > 0) { // Miktar pozitifse işlem yap [cite: 492]
            balance += amount; // balance = balance + amount [cite: 460]
            System.out.println(amount + " TL yatırıldı.");
        }
    }

    // Para çekme metodu [cite: 74]
    public void withdraw(double amount) {
        if (amount <= balance) { // Yeterli bakiye kontrolü [cite: 494]
            balance -= amount; // balance = balance - amount [cite: 460]
            System.out.println(amount + " TL çekildi.");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    // Güncel bakiyeyi döndüren metot [cite: 651, 654]
    public double getBalance() {
        return balance;
    }
}

public class alıştırma2 {
    public static void main(String[] args) {
        // 1. BankAccount nesnesi oluşturma (Başlangıç: 1000 TL) [cite: 152, 573]
        BankAccount myAccount = new BankAccount("TR123456789", 1000.0);

        // 2. 500 TL yatırma işlemi
        myAccount.deposit(500.0);

        // 3. 2000 TL çekme denemesi (Yetersiz bakiye beklenir)
        myAccount.withdraw(2000.0);

        // 4. Son bakiyeyi ekrana yazdırma [cite: 555]
        System.out.println("Son Bakiye: " + myAccount.getBalance() + " TL");
    }
}