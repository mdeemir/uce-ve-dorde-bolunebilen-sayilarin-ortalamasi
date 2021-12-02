package Giris;
import java.util.Scanner;
public class calismadosyasi {
    public static void main(String[] args) {
        Scanner km = new Scanner(System.in);
        double m,t;

        System.out.print("GİDİLEN MESAFE (KM): ");
        m = km.nextDouble();

        t = 10+ (m * 2.20);
        t = (t<=20) ? 20 : t;
        System.out.println("ÖDENECEK TUTAR TL: " + t);

        System.out.println("ÜCRET BİLGİLENDİRME:");
        System.out.println("TAKSİMETRE AÇILIŞ ÜCRETİ): 10 TL'DİR ");
        System.out.println("KM BAŞI ÜCRET: 2,20 TL'DİR");
        System.out.print("KISA MESAFE: 20 TL'DİR");





    }
}
