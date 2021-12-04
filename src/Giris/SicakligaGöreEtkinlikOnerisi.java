package Giris;
import java.util.Scanner;
public class SicakligaGöreEtkinlikOnerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("LÜTFEN sICAKLIK DEĞERİ GİRİNİZ: ");
        int heat;
        heat= input.nextInt();
        if (heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        } if (heat>=5 && heat<10){
            System.out.println("Sinemaya gidebilirsiniz.");
        } if (heat>=10&& heat<=15) {
            System.out.println("Sinemaya gidebilirsiniz.\nPikniğe gidebilirsiniz.");
        } if (heat<=25 && heat>15) {
            System.out.println("Pikniğe gidebilirsiniz");
        }
        if(heat>=25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
