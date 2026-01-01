
import java.util.Scanner;



public class whileörnek {
    public static void main(String[] args) {
      
      
      // 1'den 100'e kadar olan çift sayıları yazdıran bir while döngüsü örneği
        /*   int i=1;

        while(i<100){
            if(i%2==0){
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        }*/


      //Negatif bir sayı girilene kadar kullanıcıdan sayı almaya devam eden ve tek sayıları yazdıran bir while döngüsü örneği
     
   try (/* Scanner scanner = new Scanner(System.in);
   
    int sayi, toplam=0;
    
   
    while(true){
         System.out.println("Bir sayı giriniz (Negatif sayı ile çıkış yapabilirsiniz): ");
         sayi=scanner.nextInt();
    if(sayi<0){
        System.err.println("Negatif sayı girdiniz, program sonlandırılıyor.");
        break;
    }else{
        if(sayi%2==1){
            System.out.println("Tek sayı: " + sayi);
            toplam+=sayi;
            sayi++;
        }
    }

System.out.println("Tek sayıların toplamı: " + toplam);


 */
Scanner scan = new Scanner(System.in)) {
    int number;
    int k=1;
    
    System.out.println("Bir sayi giriniz: ");
    number = scan.nextInt();
    
    while(k<=number){
    System.out.println(k);
    k*=2;
    }
}

    }
}

