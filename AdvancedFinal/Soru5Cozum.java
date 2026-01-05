import java.awt.*;        // Frame, Button, Label, GridLayout için
import java.awt.event.*;  // ActionListener, WindowAdapter için

// 1. Frame sınıfından miras alıyoruz ve ActionListener'ı uyguluyoruz
public class Soru5Cozum extends Frame implements ActionListener {
    
    // Bileşenleri sınıf seviyesinde tanımlıyoruz ki her yerden erişebilelim
    Label etiket;
    Button buton;

    public Soru5Cozum() {
        // --- 1. PENCERE AYARLARI ---
        setTitle("Advanced Programming Exam"); // Başlık
        setSize(300, 200); // Boyut
        
        // --- 2. DÜZENLEYİCİ (LAYOUT) ---
        // Soruda GridLayout istenmiş.
        // (2, 1) diyerek 2 Satır ve 1 Sütunluk bir ızgara oluşturuyoruz.
        // Böylece etiket üstte, buton altta duracak.
        setLayout(new GridLayout(2, 1)); 

        // --- 3. BİLEŞENLERİ OLUŞTURMA ---
        etiket = new Label("Hello World!");
        // Yazıyı ortalamak için (Opsiyonel ama şık durur)
        etiket.setAlignment(Label.CENTER); 
        
        buton = new Button("Click Me");

        // --- 4. OLAY DİNLEYİCİSİ (EVENT LISTENER) ---
        // Butona tıklanınca "this" (yani bu sınıfın actionPerformed metodu) çalışsın.
        buton.addActionListener(this);

        // --- 5. BİLEŞENLERİ EKLEME ---
        add(etiket);
        add(buton);

        // --- 6. PENCEREYİ KAPATMA KODU (AWT için gereklidir) ---
        // Bu olmazsa çarpıya basınca pencere kapanmaz.
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Pencereyi görünür yap
        setVisible(true);
    }

    // --- 7. TIKLAMA OLAYI (ACTION PERFORMED) ---
    @Override
    public void actionPerformed(ActionEvent e) {
        // Soruda istenen: Butona basınca yazı değişsin.
        etiket.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new Soru5Cozum();
    }
}