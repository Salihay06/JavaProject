
import java.util.Scanner;

public class sıralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Birinci sayiyi giriniz:");
        a=scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz:");
        b=scan.nextInt();
        System.out.println("Ucuncu sayiyi giriniz:");
        c=scan.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.err.println("Siralama: " + a + " > " + b + " > " + c);
            }else{
                System.err.println("Siralama: " + a + " > " + c + " > " + b);
            }
        }else if(b>a && b>c){
            if(a>c){
                System.out.println("Siralama: " + b + " > " + a + " > " + c);
            }else{
                System.out.println("Siralama: " + b + " > " + c + " > " + a);
            }
        }else{
            if(a>b){
                System.out.println("Siralama: " + c + " > " + a + " > " + b);
            }else{
                System.out.println("Siralama: " + c + " > " + b + " > " + a);
            }
        }
    }
}
