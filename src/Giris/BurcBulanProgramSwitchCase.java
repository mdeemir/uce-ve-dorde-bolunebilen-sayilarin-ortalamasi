package Giris;
import java.util.Scanner;

public class BurcBulanProgramSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day, month;
        String burc = "";
        boolean İsError = false;

        System.out.println("LÜTFEN DOĞUM TARİHİNİZİ GİRİNİZ");
        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    İsError = true;
                }
                break;
            case 2: {
                if (day>=1 && day<=29){
                    if (day<20){
                    burc="Kova";
                    }else {
                        burc="Balık";
                    }
                }else {
                    İsError=true;
                }
            }break;

            case 3:
                if (day>=1 && day<=31) {
                    if (day < 21){
                        burc="Balık";
                    }else {
                        burc="Koç";
                    }
                }else {
                İsError=true;
                }
                break;
            case 4:
                if (day>=1&& day <=30){
                    if(day<22){
                        burc="Koç";
                    }
                    else {
                       burc="Boğa";
                    }
                }else {
                    İsError=true;
                }break;

            case 5: if (day>=1 && day <=31){
                if (day<22) {
                    burc= "Boğa";
                }else {
                    burc="İkizler";
                }
            }else {
              İsError=true;
            }break;
            case 6: if (day>=1 && day<=30) {
                if(day<24) {
                    burc="İkizler";
                }else {
                    burc="Yengeç";
                }
            } else{
                İsError=true;
            }
            break;
            case 7: if(day>=1 && day<=31){
                if (day<23){
                    burc="Yengeç";
                }else {
                    burc="Aslan";
                }
            }else {
                İsError=true;
            }
                break;
            case 8: if (day>=1 && day<=31){
                if (day<23) {
                    burc= "Aslan";
                    }else {
                    burc="Başak";
                            }

                } else {
                İsError=true;
            }
                break;
            case 9 : if (day>=1 && day<=30){
                if (day<23){
                    burc="Başak";
                }else{
                    burc="Terazi";
                }
            }else {
                İsError=true;
            }
            break;
            case 10: if (day>=1 && day<=31){
                if(day<23){
                    burc="Terazi";
                }else {
                    burc="Akrep";
                }
            }else {
                İsError=true;
            }
            break;
            case 11: if (day>=1 && day <= 30) {
                if (day<22) {
                    burc="Akrep";
                }else {
                    burc="Yay";
                }
            }else {
                İsError=true;
            }break;

            case 12: if (day>=1 && day<=31) {
                if (day<22){
                    burc="Yay";
                }else {
                    burc="Oğlak";
                }
            }else {
                İsError=true;
            }break;

            default:
                System.out.print("Hatalı bir ay girdiniz.");


        }

        if (İsError){
            System.out.println("Hatalı giriş yaptınız");
        }else {
            System.out.println("Burcunuz "+ burc);
        }
    }
}
