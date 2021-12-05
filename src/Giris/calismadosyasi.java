package Giris;

import java.util.Scanner;

public class calismadosyasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, triptype;
        boolean İsError = false;
        double ticketprice;


        System.out.println("LÜTFEN SEYAHAT BİLGİLERİNİZİ GİRİNİZ");
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1=> Tek Yön, 2=> Gidiş Dönüş) : ");
        triptype = input.nextInt();

        ticketprice = distance * 0.10;


        if (triptype>=1 && triptype<=2) {
            if (triptype==1) {
                if (age > 0) {
                    if (age >= 1 && age < 12) {
                        if (distance > 0) {
                            System.out.print("TOPLAM ÖDENECEK ÜCRET: " + (ticketprice * 0.5));
                        } else {
                            İsError = true;
                        }
                    }
                    if (age >= 12 && age <= 24) {
                        if (distance > 0) {
                            System.out.print("TOPLAM ÖDENECEK ÜCRET: " + (ticketprice * 0.9));
                        } else {
                            İsError = true;
                        }
                    }
                    if (age > 24 && age <= 65) {
                        if (distance > 0) {
                            System.out.print("TOPLAM ÖDENECEK ÜCRET: " + ticketprice);
                        } else {
                            İsError = true;
                        }
                    }

                    if (age > 65) {
                        if (distance > 0) {
                            System.out.print("TOPLAM ÖDENECEK ÜCRET: " + (ticketprice * 0.7));
                        } else {
                            İsError = true;
                        }
                    }
                } else {
                    İsError = true;
                }

            }

            if (triptype==2) {
                if (age > 0) {
                    if (age >= 1 && age < 12) {
                        if (distance > 0) {
                            System.out.print("TOPLAM ÖDENECEK ÜCRET: "+ (2 * ticketprice * 0.5 * 0.8));
                        } else {
                            İsError = true;
                        }
                    }
                    if (age >= 12 && age <= 24) {
                        if (distance > 0) {
                            System.out.print("TOPLAM ÖDENECEK ÜCRET: " + (2 * ticketprice * 0.9) * 0.8);
                        } else {
                            İsError = true;
                        }
                    }
                    if (age > 24 && age <= 65) {
                        if (distance > 0) {
                            System.out.print("TOPLAM ÖDENECEK ÜCRET: " + 2 * ticketprice);
                        } else {
                            İsError = true;
                        }
                    }

                    if (age > 65) {
                        if (distance > 0) {
                            System.out.print("TOPLAM ÖDENECEK ÜCRET: " + (2 * ticketprice * 0.7) * 0.8);
                        } else {
                            İsError = true;
                        }
                    }
                } else {
                    İsError = true;
                }
            }

        }else {
            İsError=true;
        }


        if (İsError) {
            System.out.print("HATALI GİRİŞ YAPTINIZ!!!");
        }






    }
}
