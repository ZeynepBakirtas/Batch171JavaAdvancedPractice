package practice02;

import java.util.Arrays;

public class S04_Array_EuroDolarToplami {
    public static void main(String[] args) {
            /*
        Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
        String str ="$1 $12 €34 €56 $45 €78";
        dolarToplami: 58
        euroToplami: 168
    */
        String str ="$1 $12 €34 €56 $45 €78";
        String arr[] = str.split(" ");
        String strArr = Arrays.toString(arr);
        System.out.println(strArr);

        int dolarToplam =0;
        int euroToplam =0;

        for (String w: arr){
            if (w.startsWith("€")){
                int euroDeger = Integer.parseInt(w.substring(1));//Integer.parseInt valueOf methoduyla calisma mantigi ayni
                euroToplam += euroDeger;
            } else if (w.startsWith("$")){
                int dolarDeger = Integer.parseInt(w.substring(1));//Integer.parseInt valueOf methoduyla calisma mantigi ayni
                dolarToplam += dolarDeger;
            }
        }
        System.out.println("euroToplam = " + euroToplam);
        System.out.println("dolarToplam = " + dolarToplam);
    }
}
