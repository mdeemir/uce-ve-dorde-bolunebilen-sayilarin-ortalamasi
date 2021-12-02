package Giris;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        int mat, fizik, kimya, muzik, tarih,turkce;

        Scanner inp = new Scanner(System.in);

        System.out.println("LÜTFEN NOTLARINIZI GİRİNİZ");

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+muzik+tarih);
        double ort = toplam / 6.0;

        System.out.println("ORTALAMANIZ:" + ort);

        boolean sonuc = (ort >= 60);

        String str = (sonuc) ? "GEÇTİ" : "KAlDI";

        System.out.print(str);















    }
}