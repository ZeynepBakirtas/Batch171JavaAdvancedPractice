package practice02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S03_DoWhile_TopunSicramasi {
    public static void main(String[] args) {
         /*
        Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 ü kadar yerden yukarı doğru zıplamaktadır.
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        double high = input.nextDouble();

        double toplamYol = 0;
        int count = 0;//yere vurma sayisi

        if (high>1){
            do{
                toplamYol += high;
                high *= 0.75;
                toplamYol += high;
                count++;
            }while(high>1);
            toplamYol += high;
            count++;
        }

        DecimalFormat df = new DecimalFormat("0.00");// vigul sonrasinda iki sayi olacak. Bunu gosteriyor.
        System.out.println("Topun aldigi toplam yol: " + df.format(toplamYol) + "cm \nTopun yere vurma sayisi: " + count);
    }
}
