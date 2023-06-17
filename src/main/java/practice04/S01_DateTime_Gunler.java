package practice04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class S01_DateTime_Gunler {
    /*
     Kullanıcıdan alınan bir tarihin haftanın hangi gününe denk geldiğini bulan bir program yazmanız isteniyor.
     Kullanıcıdan yıl, ay ve gün bilgilerini alarak, tarihin hangi gün olduğunu bulan bir Java programı yazın.
     Sonuç olarak, tarihin haftanın hangi gününe denk geldiğini Türkçe olarak ekrana yazdırın.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yil, ay ve gun bilgilerini sayisal olarak giriniz: ");
        int yil = input.nextInt();
        int ay = input.nextInt();
        int gun = input.nextInt();

        //LocalDateTime tarih = LocalDateTime.from(LocalDate.of(yil, ay, gun).getDayOfWeek());
        //System.out.println("tarih = " + tarih);
        LocalDate tarih2 = LocalDate.of(yil, ay, gun);
        String haftaninGunu = tarih2.getDayOfWeek().name();
        System.out.println(haftaninGunu);

        switch (haftaninGunu){
            case "MONDAY" :
                System.out.println("Girdiginiz tarih PAZARTESI gunune denk geliyor");
                break;
            case "TUESDAY" :
                System.out.println("Girdiginiz tarih SALI gunune denk geliyor");
                break;
            case "WEDNESDAY" :
                System.out.println("Girdiginiz tarih CARSAMBA gunune denk geliyor");
                break;
            case "THURSDAY" :
                System.out.println("Girdiginiz tarih PERSEMBE gunune denk geliyor");
                break;
            case "FRIDAY" :
                System.out.println("Girdiginiz tarih CUMA gunune denk geliyor");
                break;
            case "SATURDAY" :
                System.out.println("Girdiginiz tarih CUMARTESI gunune denk geliyor");
                break;
            case "SUNDAY" :
                System.out.println("Girdiginiz tarih PAZAR gunune denk geliyor");
                break;
        }


    }
}
