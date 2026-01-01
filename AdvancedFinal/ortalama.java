
import java.util.Scanner;


public class ortalama {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int quiz, vize, finalNotu;
double ortalama;

System.out.println("Quiz notunuzu giriniz:");
quiz=scan.nextInt();

System.out.println("Vize notunuzu giriniz:");
vize=scan.nextInt();

System.out.println("Final notunuzu giriniz:");
finalNotu=scan.nextInt();

ortalama= (quiz*0.2) + (vize*0.3) + (finalNotu*0.5);
System.out.println("Ortalamaniz: " + ortalama);


}



}
