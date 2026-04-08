/* sayı tahmin oyunu. 0-100 arası bir sayı tutulacak,girilen sayıya göre aşağı,yukarı denilecek.Bilince tebrikler yazılacak.
3 tahmin hakkı verilsin ve tahmin hakkı bitince mesaj verilsin. */

import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu2 {

    public static void main(String[] args) {
        
        Scanner giris=new Scanner(System.in);

        Random rastgele=new Random();

        int sayi,isayi,sayac=1;

        isayi=rastgele.nextInt(101);

        System.out.print("Sayi giriniz:");
        sayi=giris.nextInt();

        while(sayi!=isayi){

            if(sayi<isayi){
                System.out.println("Yukari");
                sayac++;

                System.out.print("Sayi giriniz:");
                sayi=giris.nextInt(); }

            else if(sayi>isayi){

                System.out.println("Asagi");
                sayac++;

                System.out.print("Sayi giriniz:");
                sayi=giris.nextInt(); }

            if(sayac==3 && sayi!=isayi){
                System.out.println("Tahmin hakki dolmustur");
                System.out.println("Istenen sayi:"+isayi);
                break;
            }

            
} 
        if(sayi==isayi)            
            System.out.println("Tekbrikler sayiyi buldunuz");
    }    
}
