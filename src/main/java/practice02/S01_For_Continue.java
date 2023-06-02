package practice02;

import java.util.Scanner;

public class S01_For_Continue {
    public static void main(String[] args) {
        /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
    */
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Lutfen " + i + ". sayiyi giriniz");
            int num = input.nextInt();
            if (num>5 && num<10){
                continue;
            }
            toplam+=num;

        }
        System.out.println(toplam);
    }
}
