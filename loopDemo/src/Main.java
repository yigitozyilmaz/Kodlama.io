public class Main {

    public static void main(String[] args) {
        //For çift sayılar döngüsü
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
        System.out.println("For çift Sayılar Döngüsü Bitti.");
        //While Tek SAyılar döngüsü

        int i = 1;
        while (i <= 50) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Tek Sayılar Döngüsü Bitti.");

        //Do-While Döngüsü
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Döngüsü Bitti");

    }
}
