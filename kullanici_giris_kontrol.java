// kütüphane tanımı
import java.util.Scanner;
public class kullanici_giris_kontrol {
    public static void main(String[] args) {
        // kullanıcıdan gelen verileri tutmak için string türünde veri tipi kullanımı.
        String username , password;
        Scanner giris = new Scanner(System.in);

        System.out.print("KULLANICI ADINIZI GİRİNİZ : ");
        username = giris.nextLine();
        System.out.print("ŞİFRENİZİ GİRİNİZ : ");
        password = giris.nextLine();
        // if else blokları ile doğruluk kontrolü 
        if(username.equals("yigit") && password.equals("123")){
            System.out.println("GİRİŞ BİLGİLERİ DOĞRU .ANA MENÜYE YÖNLENDİRİLİYORSUNUZ...");
        }
        else{
            System.out.println("EKSİK VEYA HATALI GİRİŞ YAPTINIZ, LÜTFEN TEKRAR DENEYİNİZ..");
        }

    }
    
}