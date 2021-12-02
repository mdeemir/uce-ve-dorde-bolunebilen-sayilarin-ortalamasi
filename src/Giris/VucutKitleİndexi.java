package Giris;
import java.util.Scanner;
public class VucutKitleİndexi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double height,index;
        int kg;

        System.out.print("LÜTFEN BOYUNUZU GİRİNİZ (metre cinsinden): ");
        height=inp.nextDouble();
        System.out.print("LÜTFEN KİLONUZU GİRİNİZ (kg): ");
        kg=inp.nextInt();

        index= kg/(height*height);
        System.out.print("VÜCUT KİTLE iNDEKSİNİZ: " + index);







    }
}
