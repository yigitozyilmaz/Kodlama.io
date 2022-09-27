public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println("Engin");
        System.out.println("Derin");
        System.out.println("Salih");
        System.out.println("Ahmet");

        System.out.println("-------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            //lenght = eleman sayısı
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-------------------------");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}
