import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int sayi1,sayi2,secim;
        System.out.println("Birinci sayiyi giriniz:");
        sayi1=scan.nextInt();
        System.err.println("Ikinci sayiyi giriniz:");
        sayi2=scan.nextInt();
        System.err.println("Yapmak istediginiz islemi seciniz: 1-Toplama 2-Cikarma 3-Carpma 4-Bolme");
        secim=scan.nextInt();

        switch(secim){
            case 1:
                System.out.println("Toplama:"+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println("çıkarma:"+(sayi1-sayi2));
                break;
            case 3: 
                System.out.println("Carpma:"+(sayi1*sayi2));
                break;    
            case 4:
                if(sayi2 != 0) {
                    System.out.println("Bolme:"+(sayi1/sayi2));
                } else {
                    System.out.println("Bir sayi sifira bolunemez.");
                }
                break;

                default: 
                System.out.println("Gecersiz islem secimi.");
        }
        
    }
}
