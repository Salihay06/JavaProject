class SmartLamp {
    // Özellikler private (Kapsülleme) [cite: 682]
    private boolean isOn = false; 
    private int brightness = 0;

    // Metotlar [cite: 646]
    public void turnOn() { isOn = true; }
    public void turnOff() { isOn = false; }
    
    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            this.brightness = level; // this referansı kullanımı 
        }
    }
    
    public void showStatus() {
        String durum = isOn ? "açık" : "kapalı";
        System.out.println("Lamba " + durum + ", parlaklık = " + brightness);
    }
}

public class alıştırma9 {
    public static void main(String[] args) {
        // Nesne oluşturma [cite: 573, 588]
        SmartLamp lamba = new SmartLamp();
        lamba.turnOn();
        lamba.setBrightness(75);
        lamba.showStatus(); // Çıktı: Lamba açık, parlaklık = 75
        
        lamba.turnOff();
        lamba.showStatus();
    }
}
