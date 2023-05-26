package practice01;

import java.util.Scanner;

public class S07_StringManipulations {
    public static void main(String[] args) {

         /*
        Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
        Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
        Örnek: Mark Hansel Twain ==> HT
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen tam adinizi giriniz (tek satirda)..");
        String allName = input.nextLine().trim().toUpperCase().replaceAll("\\s+", " ");

        //char s1 = allName.split(" ")[1].charAt(0);
        //char s2 = allName.split(" ")[2].charAt(0);

        char ikinciAdinIlkHarfi = allName.toUpperCase().charAt(allName.indexOf(" ")+1);
        char soyadinIlkHarfi = allName.charAt(allName.lastIndexOf(" ")+1);

        System.out.println("" + ikinciAdinIlkHarfi + soyadinIlkHarfi);



    }
}
