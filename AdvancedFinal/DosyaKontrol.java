import java.io.File;    

public class DosyaKontrol {
    public static void main(String[] args) {
        File dosya = new File("notlar.txt");

        if(dosya.exists()){
           System.out.println("Dosya mevcut.");
           System.out.println("Dosya adı: " + dosya.getName());
           System.out.println("Boyutu: " + dosya.length() + " bytes");
        
        }else{
              System.out.println("Dosya mevcut değil.");
        }
    }
}
 