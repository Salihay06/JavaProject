import java.util.Random;
import java.util.Scanner;

public class sayitahmin {
    public static void main(String[] args) {
        int tahmin , can=5, i=0;
         Random random = new Random();
         Scanner scan=new Scanner(System.in);

         int sayi=random.nextInt(100);
        boolean oyunDurum=false , hata=false;
        int[] tahminler=new int[5];
        System.out.println("Sayı tahmin oyununa hoşgeldiniz! 0-100 arasında bir sayı tuttum. Bakalım bilebilecek misin?");
        while(can>0){
            System.out.print("Tahmininizi giriniz: ");
            tahmin=scan.nextInt();

            if(tahmin<0 || tahmin>100){
                if(!hata){
                    System.out.println("Lütfen 0-100 arasında bir sayı giriniz. Bir daha hatalı girişinizde canınızdan gidecek!");
                    hata=true;
                }else{
                    can--;
                    System.out.println("Hatalı giriş yaptınız! Kalan canınız: "+can);
                }
                continue;
            }

            tahminler[i++]=tahmin;

            if(tahmin==sayi){
                System.out.println("Tebrikler! Doğru tahmin ettiniz. Sayı: "+sayi);
                oyunDurum=true;
                break;
            }else{
                can--;
                if(tahmin<sayi){
                    System.out.println("Daha büyük bir sayı deneyin. Kalan canınız: "+can);
                }else{
                    System.out.println("Daha küçük bir sayı deneyin. Kalan canınız: "+can);
                }
            }
        }

        if(!oyunDurum){
            System.out.println("Maalesef tahmin hakkınız bitti. Tutulan sayı: " + sayi);
            System.out.print("Tahminleriniz: ");
            for(int j=0; j<i; j++){
                System.out.print(tahminler[j] + " ");
            }
        }
        scan.close();
    }
    
}
