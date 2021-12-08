package Giris;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year,remainder, fourhundredremain;

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();
        remainder= (year%4);
        fourhundredremain= (year%400);

        if(remainder==0) {
            if (fourhundredremain>0){
                System.out.println(year + " bir artık yıldır.");
            } else {
                System.out.println(year + " bir artik yıl değildir." );
            }
        }else {
            System.out.println(year + " bir artik yıl değildir." );
        }



    }
}
