package practice02;

import java.util.Arrays;

public class S09_Array_OturmaPlani {
    public static void main(String[] args) {
        /*
        Bir parti organizasyonunda, katılımcıların oturma planını bir array olarak tutuyorsunuz.
        Oturma planını yazdırdığınızda boş sandalyeler null olarak görünüyor.
        Bunun yerine "Rezerve Değil" yazmasını istiyorsunuz.
            String[] oturmaPlani = new String[10];
            System.out.println(Arrays.toString(oturmaPlani));
    */
        String[] oturmaPlani = new String[10];
        System.out.println(Arrays.toString(oturmaPlani));

        String newValue = "Rezerve degil";
        Arrays.fill(oturmaPlani, newValue);//elemanlari update ediyoruz. dolduruyoruz.

        System.out.println(Arrays.toString(oturmaPlani));
    }
}
