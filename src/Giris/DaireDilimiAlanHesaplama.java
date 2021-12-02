package Giris;
import java.util.Scanner;
public class DaireDilimiAlanHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int r,acisi;
        System.out.print("LÜTFEN DAİRENİN YARI ÇAPINI GİRİNİZ:");
        r = inp.nextInt();

        System.out.print("LÜTFEN DAİRENİN DİLİMİNİN MERKEZ AÇISINI GİRİNİZ: ");
        acisi=inp.nextInt();

        double area, pi=3.14;

        area=(pi*(r*r)*acisi)/360;

        System.out.print("DAİRENİN ALANI: " + area);

    }

}
