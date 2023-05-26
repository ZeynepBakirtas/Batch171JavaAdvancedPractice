package practice01;

import java.util.Scanner;

public class S08_StringManipulations_IfElse {
    public static void main(String[] args) {
            /*
        Kullanıcının girdiği bir String ifadenin son üç karakterini alarak bu üç karakteri String ifadenin başına ve sonuna ekleyen
        bir Java programı yazınız.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("En az uc karakterli bir kelime giriniz...");
        String word = input.next().trim();

        if (word.length()>2){
            String result = word.substring(word.length()-3);
            System.out.println(result + word + result);
        } else {
            System.out.println("En az uc karakterli bir kelime giriniz...");
        }



    }
}
