
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class OkulSistemi {
    /**
     * @param args
     */
    public static void main(String[] args) {
    
        ArraysList<String> isimListesi = new ArraysList<>();
        isimListesi.add("Ahmet");
        isimListesi.add("Mehmet");
        isimListesi.add("Ayşe");

        HashSet<Integer> numaralar = new HashSet<>();
         numaralar.add(101);
            numaralar.add(102);
            numaralar.add(103);

        HashSet<Integer, Integer> notDefteri = new HashSet<>();
        notDefteri.put(101, 85);
        notDefteri.put(102, 90);
        notDefteri.put(103, 78);

        try {
           FileWriter kalem = new FileWriter("okul_sistemi.txt");
              kalem.write("İsimler:\n");
                for (String isim : isimListesi) {
                    kalem.write(isim + "\n");
                }
                kalem.close(); 
        } catch (Exception e) {
            System.out.println("Dosya yazma hatası: " + e.getMessage());
        }


        try {
            FileReader dosyaOku = new FileReader("okul_sistemi.txt");
            BufferReader tampon = new BufferReader();
            String satir;
            while ((satir = tampon.readLine()) != null) {
                System.out.println(satir);
            }
            tampon.clone();
        } catch (Exception e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }

}
