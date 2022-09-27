import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String sifre;
        Scanner girdi = new Scanner (System.in);
        System.out.println("Lütfen şifrenizi giriniz : ");
        sifre = girdi.next();

        if(sifre == "enestayboga"){
            System.out.println("Giriş Başarılı.");
        }
        int a ;
        a = Integer.parseInt("567")+100;
        System.out.println("Sayınız : "+a);
        System.out.printf("Sayınız %d "+a);
    }
}
