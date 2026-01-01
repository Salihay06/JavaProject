public class forörnekleri {
    public static void main(String[] args) {
     
        //Armstrong sayıları bulan bir for döngüsü örneği
      int birler, onlar , yüzler, temp, toplam=0;
        for(int i=100; i<=999;i++){
            temp=i;
            birler=temp%10;
            temp/=10;

            onlar=temp%10;
            temp/=10;

            yüzler=temp%10;

            toplam=(birler*birler*birler)+(onlar*onlar*onlar)+(yüzler*yüzler*yüzler);

            if(toplam==i){
                System.out.println(i + " bir Armstrong sayıdır.");
            }
        }
        
    }
}
