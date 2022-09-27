import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel. ";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length()); //length = Eleman sayısı.
        System.out.println("7. eleman : " + mesaj.charAt(7)); //mesaj.charAt = kaçıncı eleman olduğunu gösterir.
        System.out.println(mesaj.concat(" Yaşasın!")); //mesaj.concat = mesaj ekle demek
        System.out.println(mesaj.startsWith("B")); //startsWith = Verilen harf ile mi başlar sorusunu sorar. T or F verir.
        System.out.println(mesaj.endsWith(".")); //endsWith = verilen harf ile mi biter sorunusu sorar. T of F verir.
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        //getChars = verilen aralıkta sayıları ekrana yaz demek. srcBegin:Başlama harfi, srcEnd:Bitiş harfi, dstBegin:Baştan kaçıncı karakterden başlayayım da yazmaya başlayayım der.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("çok")); //indexOf = bir harf veya kelime topluluğunun "BAŞTAN" nereden başladığını yazar.
        System.out.println(mesaj.indexOf('k'));
        System.out.println(mesaj.lastIndexOf("a")); //lastIndexOf = bir harf veya kelime topluluğunun "SONDAN" nereden başladığını belirler. Kaçıncı karakter olduğunu baştan sayarak başlar
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        String yeniMesaj = mesaj.replace(' ', '-'); //replace = bir harfi yada topluluğu değiştirmek için kullanılır.
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2)); //substring = belirtilen öbekten sonrasını ekrana yazar, öncekini siler.
        System.out.println(mesaj.substring(2, 5)); //mesaj.substring(2,5) = 2 ile 5 arasındaki kelimeleri erkana yaz der.
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for(String kelime : mesaj.split(" ")){  //split = belirlenen harf veya öbeği silip alt alta yazar.
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); //toLowerCase = tüm harfleri küçük yazar.
        System.out.println(mesaj.toUpperCase()); //toUpperCase = tüm harfleri büyük yazar.
        String yenimesaj1 = "        Biruni Üniversitesi      ";
        System.out.println(yenimesaj1);
        System.out.println(yenimesaj1.trim()); //trim = farklı kaynaklardan gelen kodlar bazen bozulurlar başlarında aralarında boşluklar olur. Bu kod bu boşlukları siler.
    }
}
