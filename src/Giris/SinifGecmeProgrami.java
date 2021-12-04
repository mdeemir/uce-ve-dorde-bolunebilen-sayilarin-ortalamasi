package Giris;
import java.util.Scanner;
public class SinifGecmeProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,kimya,turkce,muzik;

        System.out.println("LÜTFEN DERS NOTLARINIZI GİRİNİZ");
        System.out.print("Matematik Notunuz: ");
        mat=input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik=input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya= input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce= input.nextByte();
        System.out.print("Müzik Notunuz: ");
        muzik=input.nextInt();


        double average;
        int manot,fnot,knot,tnot,munot,dividenumber;
        //notlar 0 dan küçük ve 100 den büyük olduğu takdirde ortalamaya katılmayacaklarından dolayı bölme sayısını bulmak için değişkenler tanımlandı

        manot= (mat<0 || mat>100) ? 0 : 1;
        fnot= (fizik<0 || fizik>100) ? 0 : 1;
        knot= (kimya<0 || kimya>100) ? 0 : 1;
        tnot= (turkce<0 || turkce>100) ? 0 : 1;
        munot= (muzik<0 || muzik>100) ? 0 : 1;

        dividenumber=(manot+fnot+knot+tnot+munot);


        int amat,afizik,akimya,aturkce,amuzik;
        //not 0 dan küçük veya 100 dn büyük olursa notun ortlama hesaplamasına girmemesi için değişkenler tanımlandı

        amat=(manot==0) ? 0 : mat;
        afizik=(fnot==0) ? 0 :fizik;
        akimya=(knot==0) ? 0 : kimya;
        aturkce=(tnot==0) ? 0 : turkce;
        amuzik=(munot==0) ? 0 : muzik;


  average= (amat+afizik+akimya+aturkce+amuzik)/dividenumber;

        System.out.println("ORTALAMANIZ: " + average);

        if (average < 55){
            System.out.println("KALDINIZ!!! Seneye tekrar görüşürüz.");} else {
                System.out.println("GEÇTİNİZ");};

        System.out.println("AÇIKLAMA\n 0 dan küçük ve 100den büyük olarak girilen notlar hesaplamaya dahil edilmemiştir.\n HESAPLAMANIN DOĞRU OLDUĞUNDAN EMİN OLMAK İÇN LÜTFEN GİRDİĞİNİZ NOTLARI KONTROL EDİNİZ");




    }
}
