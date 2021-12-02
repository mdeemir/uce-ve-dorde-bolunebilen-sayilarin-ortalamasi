package Giris;
import java.util.Scanner;
public class Ucgenalanihesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a, b, c, u;
        double s;

        Scanner kenar = new Scanner(System.in);

        System.out.println("LÜTFEN KENAR UZUNLUKLARINI GİRİNİZ:");

        System.out.print("KENAR 1: ");
        a = kenar.nextDouble();

        System.out.print("KENAR 2: ");
        b = kenar.nextDouble();

        System.out.print("KENAR 3: ");
        c = kenar.nextDouble();

        u = (a+b+c) / 2;

        s = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("ÜÇGENİN ALANI: ");
        System.out.print(s);



    }
}
