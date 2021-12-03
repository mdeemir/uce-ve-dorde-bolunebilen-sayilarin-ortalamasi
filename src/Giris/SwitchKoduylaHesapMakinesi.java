package Giris;
import java.util.Scanner;
public class SwitchKoduylaHesapMakinesi {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        int n1,n2,select;

        System.out.println("LÜTFEN RAKAMLARI GİRNİZ:");
        System.out.print("Birinci Rakam: ");
        n1= inp.nextInt();
        System.out.print("İkinci Rakam: ");
        n2= inp.nextInt();

        System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ GİRİNİZ: ");
        System.out.println("Toplama için 1:\nÇıkarma için 2: \nÇarpma için 3: \nBölme için 4:");
        System.out.print("Yapılmasını istediğiniz işlemi seçiniz: ");
        select = inp.nextInt();


        switch (select){
            case 1:
                System.out.println("Toplama işlemini seçtiniz\nSonuç: " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma işlemini seçtiniz\nSonuç: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma işlemini seçtiniz\nSonuç: "+ (n1*n2));
                break;
            case 4:
                if(n2==0) {
                    System.out.println("HİÇBİR SAYI SIFIRA BÖLÜNEMEZ!!!");}
                    else{
                        System.out.println("Bölme işlemini seçtiniz\nSonuç: " + (n1/n2));}
                break;

            default:
                System.out.println("GEÇERSİZ BİR SEÇİM YAPTINIZ!!! Tekrar Deneyiniz");

        }



    }

}
