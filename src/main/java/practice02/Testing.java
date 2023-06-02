package practice02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 adet sayi giriniz");
        double arr[] = new double[5];
        double toplam = 0;

        for (double w: arr){
            w= input.nextDouble();
            if (w>5 && w<10){
                continue;
            } else {
                toplam += w;
            }
        }
        System.out.println(toplam);

        /*
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
       Örnek Ekran çıktısı
        1   2   3   4   5
        2   4   6   8   10
        3   6   9   12  15
        4   8   12  16  20
        5   10  15  20  25
       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir.
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre ekrana yazan bir kod yazabilirsiniz.
    */
        System.out.println("Lutfen kacli carpim tablosu istiyorsaniz giriniz..");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num ; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }

        /*
        Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
        String str ="$1 $12 €34 €56 $45 €78";
        dolarToplami: 58
        euroToplami: 168
    */
        String str ="$1 $12 €34 €56 $45 €78";
        String arr2[] = str.split(" ");

        int euroToplam = 0;
        int dolarToplam =0;
        for (String w: arr2){
            if (w.startsWith("$")) {
                int dolarValue = Integer.parseInt(w.substring(1));
                 dolarToplam += dolarValue;
            } else  if (w.startsWith("€")) {
                int euroValue = Integer.parseInt(w.substring(1));
                euroToplam += euroValue;
            }
        }
        System.out.println("dolarToplam = " + dolarToplam);
        System.out.println("euroToplam = " + euroToplam);

        /*
        Array içerisindeki elementlerin işaretlerini (+-) değiştiren bir kod yazınız.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
    */
        int arr3[] = {1,2,-3,4,-5,-6};
        int newArr[] = new int[arr3.length];

        int idx = 0;
        for (int w: arr3){
            newArr[idx] = -w;
            idx++;
        }
        System.out.println("newArr = " + Arrays.toString(newArr));

        /*
        Bir öğrenci sınıfının notlarını içeren bir array verildiğinde,
        bu notların ortalamasını hesaplayan bir program yazın.
        {84, 91, 76, 85, 98}
    */
        int not[] = {84, 91, 76, 85, 98};
        int sum = 0;

        for (int w: not){
            sum += w;
        }
        double arg = sum/not.length;
        System.out.println("arg = " + arg);

        /*
        Bir sınıfta bulunan öğrencilerin isimlerini içeren bir array verildiğinde,
        bu öğrencilerin isimlerini sıralayan bir program yazın.
        {"Ali", "Zeynep", "Mehmet", "Ayşe"}
    */
        String studentName[] = {"Ali", "Zeynep", "Mehmet", "Ayşe"};
        Arrays.sort(studentName);
        System.out.println("studentName = " + Arrays.toString(studentName));

        /*
        Bir e-ticaret uygulamasında, bir kullanıcının sepetindeki ürünleri bir array'de tutuyorsunuz.
        Kullanıcının sepetinde belirli bir ürünün olup olmadığını kontrol edin.
        {"Telefon", "Bilgisayar", "Klavye", "Mouse"}
    */
        String product[] =  {"Telefon", "Bilgisayar", "Klavye", "Mouse"};
        String search = "Klavye";
        boolean isHave = false;

        for (String w: product){
            if (w.equalsIgnoreCase(search)) {
                isHave = true;
            }
        }

        if (isHave){
            System.out.println("Aranan " + search + " urunu bulunmaktadir..");
        } else {
            System.out.println("Aranan " + search + " urunu bulunmamaktadir..");
        }

        /*
        Bir parti organizasyonunda, katılımcıların oturma planını bir array olarak tutuyorsunuz.
        Oturma planını yazdırdığınızda boş sandalyeler null olarak görünüyor.
        Bunun yerine "Rezerve Değil" yazmasını istiyorsunuz.
            String[] oturmaPlani = new String[10];
            System.out.println(Arrays.toString(oturmaPlani));
    */

        String[] oturmaPlani = new String[10];
        System.out.println(Arrays.toString(oturmaPlani));

        Arrays.fill(oturmaPlani, "Rezerve Degil");
        System.out.println("Oturma plani = " + Arrays.toString(oturmaPlani));
    }
}
