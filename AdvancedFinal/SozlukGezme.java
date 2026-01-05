import java.util.HashMap;

public class SozlukGezme {

    public static void main(String[] args) {
        HashMap<String,String> ulkeler=new HashMap<>();

        ulkeler.put("Türkiye","Ankara");
        ulkeler.put("Almanya","Berlin");
        ulkeler.put("Fransa","Paris");

        System.out.println( "Ülke Başkentleri:" );

        for(String ulke : ulkeler.keySet()){
            String baskent=ulkeler.get(ulke);
            System.out.println(ulke + " : " + baskent);


        }
    }
    
}
