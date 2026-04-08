//ideal kilo hesaplama programı

import java.util.Scanner;

public class idealKiloHesaplama {
    public static void main(String[] args) {
        
        Scanner giris= new Scanner(System.in);

        double boy,yas,kilo,idealKilo=0,K,mesaj=0;
        char cinsiyet;

        System.out.print("Boyunuzu giriniz: (cm cinsinden)");
        boy=giris.nextDouble();

        System.out.print("Yasinizi giriniz:");
        yas=giris.nextDouble();

        System.out.print("Cinsiyetinizi giriniz: (Kadin:K, Erkek:E)");
        cinsiyet=giris.next().charAt(0);

        System.out.print("Kilonuzu giriniz: (kg cinsinden)");
        kilo=giris.nextDouble();

        if(cinsiyet=='K'){

            K=0.8;
            idealKilo=(boy-100+(yas/10))*K;

            System.out.println("Ideal kilonuz:"+idealKilo);
        }

        else if(cinsiyet=='E'){

            K=0.9;
            idealKilo=(boy-100+(yas/10))*K;

            System.out.println("Ideal kilonuz:"+idealKilo);
        }

        if(kilo>idealKilo){

            mesaj=kilo-idealKilo;

            System.out.println("Vermeniz gereken kilo: "+mesaj);
        }

        else if(kilo<idealKilo){

            mesaj=idealKilo-kilo;

            System.out.println("Almaniz gereken kilo:"+mesaj);

            
        }

        else{
            System.out.println("Tebrikler,ideal kilonuzdasiniz");
        }
        
}
}
