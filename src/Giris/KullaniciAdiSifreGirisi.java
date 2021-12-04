package Giris;
import java.util.Scanner;
public class KullaniciAdiSifreGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("LÜTFEN KULLANICI ADI ve ŞİFRENİZİ GİRİNİZ\nKullanıcı Adı: ");
        String userName, password, newpassword;

        userName = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Başarılı şekilde giriş yaptınız.");
        }else{
            System.out.println("Hatalı yaptınız! Tekrar deneyin veya parolayı sıfırlayın.");
            System.out.println("Şifrenizi sıfırlamak isterseniz lütfen yeni şifrenizi giriniz:\nYeni Şifre: ");
            newpassword = inp.nextLine();

            System.out.println("Sonrasındaki işlem içim programlanamadı!!!!!!");












        }

    }
}


