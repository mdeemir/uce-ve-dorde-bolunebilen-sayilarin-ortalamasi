package Giris;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, remainder;

        String burc="";

        System.out.print("DOĞUM YILINIZI GİRİNİZ:");
        year=input.nextInt();
        remainder = (year%12);
        switch (remainder){
            case 1: burc="Horoz"; break;
            case 2: burc="Köpek"; break;
            case 3: burc="Domuz"; break;
            case 4: burc="Fare"; break;
            case 5: burc="Öküz"; break;
            case 6: burc="Kaplan"; break;
            case 7: burc="Tavşan"; break;
            case 8: burc="Ejderha"; break;
            case 9: burc="Yılan"; break;
            case 10: burc="At"; break;
            case 11: burc="Koyun"; break;
            default : burc ="Maymun";
        }
        System.out.println("ÇİN ZODYAĞI BURCUNUZ: " + burc);



    }
}
