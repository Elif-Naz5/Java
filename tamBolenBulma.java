//Klavyeden girilen bir sayının tam bölenlerini ekrana yazdırınız.

import java.util.Scanner;

public class tamBolenBulma {
    public static void main(String[] args) {

        Scanner giris= new Scanner(System.in);

        int sayi,adet=0;

        System.out.print("Sayi giriniz:");
        sayi=giris.nextInt();

        for(int i=1;i<=sayi;i++){

            if(sayi%i==0){
                System.out.println(i);
                adet++;
            }
        }

        System.out.println(adet+" tane tam boleni vardir");

        
    }
    
}
