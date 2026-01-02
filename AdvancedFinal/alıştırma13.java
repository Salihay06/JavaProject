class User {
    void login() { System.out.println("Sisteme giriş yapıldı."); }
    void sendMessage(String msg) { System.out.println("Mesaj gönderildi: " + msg); }
    void uploadFile(String fileName) { System.out.println("Dosya yüklendi: " + fileName); }
}

class Guest extends User {
    @Override
    void sendMessage(String msg) { System.out.println("Misafir mesaj gönderemez!"); }

    @Override
    void uploadFile(String fileName) { System.out.println("Misafir dosya yükleyemez!"); }

    public static void main(String[] args) {
        System.out.println("--- User İşlemleri ---");
        User user = new User();
        user.login();
        user.sendMessage("Merhaba");
        user.uploadFile("foto.jpg");

        System.out.println("\n--- Guest İşlemleri ---");
        Guest guest = new Guest();
        guest.login();
        guest.sendMessage("Selam");
        guest.uploadFile("rapor.pdf");
    }
}