public class metot {
    static void isPolindrmic(int input){
        int temp, terssayi=0,kalan;

      if(input<0){
          System.out.println("Negatif sayılar polindromik olamaz");
          return;
      }
        temp=input;
        while(temp!=0){
            kalan=temp%10;
            terssayi=terssayi*10+kalan;
            temp/=10;
        }
        if(terssayi==input){
            System.out.println(input+" sayısı polindromiktir.");
        }else{
            System.out.println(input+" sayısı polindromik değildir.");
        }

    }

    public static void main(String[] args) {
        isPolindrmic(12321);
        isPolindrmic(-121);
        isPolindrmic(123);
    }
}
