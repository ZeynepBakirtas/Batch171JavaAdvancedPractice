package practice01;

import java.util.Scanner;

public class S04_Hipotenus_Metot {
    public static void main(String[] args) {
        /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */


        Scanner input = new Scanner(System.in);
        System.out.println("a kenarinin uzunlugunu giriniz..");
        double a = input.nextDouble();

        System.out.println("b kenarinin uzunlugunu giriniz..");
        double b = input.nextDouble();

        System.out.println("karakok: " + karakokAl(a,b));

    }

    public static double karakokAl(double a, double b) {

        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }


}
