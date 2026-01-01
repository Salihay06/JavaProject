
import java.util.Scanner;

public class biletindirimi {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yas,mesafe,tip;
        double normalFiyat = 0,yasindirimi,tipindirimi;

        System.out.println("Mesafeyi km cinsinden giriniz:");
        mesafe=scan.nextInt();
        System.out.println("Yasinizi giriniz:");
        yas=scan.nextInt();
        System.out.println("Yolculuk tipini giriniz (1-Tek Yon, 2-Gidis Donus):");
        tip=scan.nextInt();

        if(yas>0 && mesafe>0 && (tip==1 || tip==2)){
            normalFiyat=mesafe*0.10;
            if(yas<12){
                yasindirimi=normalFiyat*0.50;
            }else if(yas>=12 && yas<=24){
                yasindirimi=normalFiyat*0.10;
            }else if(yas>65){
                yasindirimi=normalFiyat*0.30;
        }else{
            yasindirimi=0;
       }
    
    normalFiyat-=yasindirimi;
    }if(tip==2){
        tipindirimi=normalFiyat*0.20;
        normalFiyat=(normalFiyat-tipindirimi)*2;
    }
    System.out.println("Toplam Tutar: " + normalFiyat+ " TL");
}
}
