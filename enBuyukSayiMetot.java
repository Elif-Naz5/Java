//Çağrıldığında klavyeden 10 tane tam sayı girişi yapılıp bu sayılardan en 
//büyük olanını geriye döndüren bir metot yazınız.

import java.util.Scanner;

public class enBuyukSayiMetot {
    public static void main(String[] args) {

        System.out.println("En buyuk sayi: "+enBuyuk());
        
    }

    public static int enBuyuk(){

        Scanner giris= new Scanner(System.in);

        int enBuyuk,sayi,bsayi;

        System.out.print("1. sayiyi giriniz: ");
        bsayi=giris.nextInt();
        enBuyuk=bsayi;

        for(int i=1;i<10;i++){
            System.out.print((i+1)+". sayiyi giriniz: ");
            sayi=giris.nextInt();

            if(enBuyuk<sayi){
                enBuyuk=sayi;
            }
        }

        return enBuyuk;
    }
    
}
