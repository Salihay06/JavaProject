/*
İnternetten dosya indiren bir program. Dosya inerken internet kesilebilir.

Sorun: İnternet yoksa indirme işlemi yarım kalır.

İşçi (dosyaIndir): Bağlantıyı kontrol eder. Bağlantı kopuksa "Ağ Hatası" fırlatır. Bu hatayı kendisi çözmez (modemi resetleyemez), sadece bildirir.

Patron (main): İndirmeyi başlatır. Hata gelirse "Lütfen modeminizi kontrol edin" der.
*/

public class IndirmeYoneticisi {
    static void dosyaIndir(boolean  internetVarMi) throws Exception{

        if(!internetVarMi){
            throw new Exception("Ağ Hatası: İnternet bağlantısı yok.");
        }
        System.err.println("Dosya indiriliyor...");
    }
    public static void main(String[] args) {
        try{
            dosyaIndir(false);
        } catch (Exception e) {
            System.out.println("Lütfen modeminizi kontrol edin: " + e.getMessage());
        }
    }
}
