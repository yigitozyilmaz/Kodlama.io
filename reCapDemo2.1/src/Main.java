public class Main {

    public static void main(String[] args) {
        double [] myList = {1.5, 5.1, 8.5, 9.4, 2.4, 1.8, 2.6, 3.5, 1.9};
        double total = 0;
        double min = myList[1];
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            if ( min > number ){
                      min=number;
            }
          total = total+number;
            System.out.println(number);
        }
         System.out.println("Toplam = " + total);
         System.out.println("Min = " + min);
         System.out.println("Max = " + max);
         System.out.println("İşlem Başarılı!");
       
    }
}
