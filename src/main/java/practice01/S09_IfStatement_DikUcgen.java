package practice01;

import java.util.Scanner;

public class S09_IfStatement_DikUcgen {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Not: Bir üçgenin dik olduğunu anlamak için a^2 + b^2 = c^2 pisagor bağlantısından yararlanabilirsiniz)
        */

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen uc adet sayi giriniz...");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            boolean hypotenuse1 = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
            boolean hypotenuse2 = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
            boolean hypotenuse3 = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Gecersiz deger girdiniz. Lutfen tekrar deger giriniz..");
            } else if (hypotenuse1 || hypotenuse2 || hypotenuse3) {
                System.out.println("Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uyar.");
                break;
            } else {
                System.out.println("Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uymaz.");
                break;
            }

        }while (true) ;
    }
}

