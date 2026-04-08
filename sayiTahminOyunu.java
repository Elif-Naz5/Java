/* Sayı tahmin oyunu. 0-100 arası bir sayı tutulacak,girilen sayıya göre aşağı,yukarı denilecek.Bilince tebrikler yazılacak.
Kaç tahminde bildiğini de yazsın. */

import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {

    public static void main(String[] args) {
    
    Random rastgele=new Random();

    Scanner giris=new Scanner(System.in);

    int sayi,isayi,tahmin=1;

    isayi=rastgele.nextInt(101);

    System.out.print("Sayi giriniz:");
    sayi=giris.nextInt();

    while(sayi!=isayi){

        if(sayi<isayi) {
            System.out.println("Yukari");

            tahmin++;

            System.out.print("Sayi giriniz:");
            sayi=giris.nextInt(); }

        else if(sayi>isayi) {
            System.out.println("Asagi");

            tahmin++;

            System.out.print("Sayi giriniz:");
            sayi=giris.nextInt(); }
    }

    System.out.println("Tebrikler,sayiyi buldunuz");
    System.out.println("Tahmin sayisi:"+tahmin);

}
    
}
