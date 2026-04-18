//Çarpım tablosu programı. Klavyeden çarpan ve kaç adım olacağı bilgisi girildikten sonra çıktı versin.

import java.util.Scanner;

public class carpimTablosu {

    public static void main(String[] args) {

        Scanner giris=new Scanner(System.in);

        int carpan,sayi,carpim=1;

        System.out.print("Sayi giriniz:");
        sayi=giris.nextInt();

        System.out.print("Carpan giriniz:");
        carpan=giris.nextInt();

        for(int i=1;i<=sayi;i++){

            carpim=i*carpan;

            System.out.println(i+"*"+carpan+ "="+carpim);
        
        }
        
    }
    
}
