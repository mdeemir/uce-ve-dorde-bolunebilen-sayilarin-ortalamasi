package Giris;

import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double fiyati;
        Scanner inp = new Scanner(System.in);

        System.out.print("ÜRÜNÜN FİYATINI GİRİNİZ: ");
        fiyati = inp.nextDouble();

        double kdv, kdvli, kdvsiz, oran;

        oran = fiyati <= 1000 ? 18 : 8;
        kdv = fiyati * oran/100;
        kdvli = fiyati + kdv;
        kdvsiz = fiyati;

        System.out.println("KDV'SİZ FİYATI: " + kdvsiz);
        System.out.println("KDV ORANI: " +kdv/fiyati);
        System.out.println("KDV TUTARI: " + kdv);
        System.out.print("KDV'li FİYATI: " + kdvli);



    }
}
