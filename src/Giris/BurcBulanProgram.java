package Giris;
import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day, month;
        String burc="";
        boolean İsError = false;


        System.out.println("LÜTFEN DOĞUM TARİHİNİZİ GİRİNİZ: ");
        System.out.print("Doğduğunuz ay: ");
        month= input.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();


        if(month>=1 && month<=12) {
            if (month == 1) {
                if (day >= 1 && day < 22) {
                    burc = "Oğlak";
                } else if (day >= 23 && day <= 31) {
                    burc = "Kova";
                } else {
                    İsError = true;
                }

            }
            if (month == 2) {
                if (day >= 1 && day < 20) {
                    burc = "Kova";
                } else if (day >= 20 && day <= 29) {
                    burc = "Balık";
                } else {
                    İsError = true;
                }

            }
            if (month == 3) {
                if (day >= 1 && day < 21) {
                    burc = "Balık";
                } else if (day >= 21 && day <= 31) {
                    burc = "Koç";
                } else {
                    İsError = true;
                }

            }
            if (month == 4) {
                if (day >= 1 && day < 21) {
                    burc = "Koç";
                } else if (day >= 21 && day <= 30) {
                    burc = "Boğa";
                } else {
                    İsError = true;
                }

            }
            if (month == 5) {
                if (day >= 1 && day < 22) {
                    burc = "Boğa";
                } else if (day >= 23 && day <= 31) {
                    burc = "İkizler";
                } else {
                    İsError = true;
                }

            }
            if (month == 6) {
                if (day >= 1 && day < 23) {
                    burc = "İkizler";
                } else if (day >= 23 && day <= 30) {
                    burc = "Yengeç";
                } else {
                    İsError = true;
                }

            }
            if (month == 7) {
                if (day >= 1 && day < 23) {
                    burc = "Yengeç";
                } else if (day >= 23 && day <= 31) {
                    burc = "Aslan";
                } else {
                    İsError = true;
                }

            }
            if (month == 8) {
                if (day >= 1 && day < 23) {
                    burc = "Aslan";
                } else if (day >= 23 && day <= 31) {
                    burc = "Başak";
                } else {
                    İsError = true;
                }

            }
            if (month == 9) {
                if (day >= 1 && day < 23) {
                    burc = "Başak";
                } else if (day >= 23 && day <= 30) {
                    burc = "Terazi";
                } else {
                    İsError = true;
                }

            }
            if (month == 10) {
                if (day >= 1 && day < 24) {
                    burc = "Terazi";
                } else if (day >= 23 && day <= 31) {
                    burc = "Akrep";
                } else {
                    İsError = true;
                }

            }
            if (month == 11) {
                if (day >= 1 && day < 22) {
                    burc = "Akrep";
                } else if (day >= 22 && day <= 30) {
                    burc = "Yay";
                } else {
                    İsError = true;
                }

            }
            if (month == 12) {
                if (day >= 1 && day < 23) {
                    burc = "Yay";
                } else if (day >= 23 && day <= 31) {
                    burc = "Oğlak";
                } else {
                    İsError = true;
                }
            }
        } else {
            İsError=true;
        }

        if (İsError){
            System.out.println("Hatalı giriş yaptınız.!!!");
        } else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}
