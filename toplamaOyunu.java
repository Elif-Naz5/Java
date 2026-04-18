//toplama işlemini öğreten puanlı oyun programı

import java.util.Random;
import java.util.Scanner;

public class toplamaOyunu {
    public static void main(String[] args) {

        Scanner giris=new Scanner(System.in);

        Random rastgele= new Random();

        int sayi1,sayi2,toplam=0,cevap;
        int d=0,y=0,puan=0;
        char secenek;

        System.out.println("-----Hos Geldiniz-----");
        System.out.println("Doğru: 5 puan");
        System.out.println("Yanlıs: -2 puan");
        System.out.println();

        do{
            sayi1=rastgele.nextInt(100)+1;
            sayi2=rastgele.nextInt(100)+1;

            System.out.println("Sayi1= "+sayi1+ " ve Sayi2= "+sayi2);
            System.out.print("Toplamlari nedir? ");
            cevap=giris.nextInt();

            toplam=sayi1+sayi2;

            if(toplam==cevap) {
                System.out.println("Tebrikler bildiniz");
                d++;
                puan+=5;
            }

            else{
                System.out.println("Uzgunum bilemediniz");
                y++;
                puan-=2;
            }

            System.out.print("Tekrar oynamak ister misiniz? (e/E yeniden oynamak icin) ");
            secenek=giris.next().charAt(0);       

        }while(secenek=='e'|| secenek=='E');

        System.out.println("Dogru cevap sayisi:"+d);
        System.out.println("Yanlis cevap sayisi:"+y);
        System.out.println("Puan:"+puan);
        
    }    
}
