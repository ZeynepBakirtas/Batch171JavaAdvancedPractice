package practice01;

import java.util.Scanner;

public class S06_Regex_Ve_StringManipulations {
    public static void main(String[] args) {


            /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız.
       Ad ayrı, soyad ayrı sekilde ekrana yazdırınız.
       Örnek:
          Ad: Ali
          Soyad: Can
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ad soyad giriniz..");
        String allName = input.nextLine().trim().replaceAll("\\s+", " ");;

        String name = allName.split(" ")[0];
        String surName = allName.split(" ")[1];

        System.out.println("Ad: " + name);
        System.out.println("Soyad: " + surName);


    }
}
