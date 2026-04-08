//Direnç hesaplama 

import java.util.Scanner;

public class direncHesaplama {

    public static void main(String[] args) {
        
        Scanner giris=new Scanner(System.in);

        double direnc1,direnc2,esdegerDirenc=0;
        String tur;

        System.out.print("1. direnci girin:");
        direnc1 =giris.nextDouble();

        System.out.print("2. direnci giriniz:");
        direnc2=giris.nextDouble();

        giris.nextLine();

        System.out.print("Devre turunu seciniz: (s,p)");
        tur=giris.nextLine();

        switch(tur){

            case"s":
            esdegerDirenc=direnc1+direnc2;
            break;

            case"p":esdegerDirenc=1/direnc1+1/direnc2;
            break;

            default:
                System.out.println("Hatali devre turu!");
}
        System.out.println(esdegerDirenc);
}
    
}
