public class Main {

    public static void main(String[] args) {
        int number = 3;
        // int remeinder = number % 2; // remeinder:kalan demek ing de //% operatörü kalan sayıyı bulmak için kullanılır.
        // System.out.println(remeinder);
        boolean isPrime = true; //isPrime : Asal mı?
        if(number==1){
            System.out.println("Sayı Asal Değildir.");
            return; // komutu peşin peşin bitir demek. Tek çıktı almak için kullanılır.
        }
        if(number<1){
            System.out.println("Geçersiz Sayı.");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("Sayı Asaldır.");
        } else {
            System.out.println("Sayı Asal Değildir.");
        }
    }
}



