package practice04;

import java.util.Scanner;

public abstract class S03_Varargs_KargoSirketi {
    /*
        Bir kargo şirketi, gönderilen paketlerin toplam ağırlığını hesaplayan bir metot yazmanızı istiyor.
        Metot, paketlerin ağırlıklarını almalıdır. Paketlerin toplam ağırlığını döndüren ve
        hiç paket gönderilmediğinde 0 döndüren bir metot yazın.
    */

    public static void main(String[] args) {
        double toplam = toplamAgirlikHesapla(1.5, 3.75, 4.32, 5.64);
        System.out.println("Toplam agirlik: " + toplam + " kg'dir");

    }

    public static double toplamAgirlikHesapla (double... paketler) {//varargs en sona yazilir, farkli parametreler varsa
        double toplamAgirlik = 0;

        for (double agirlik : paketler){
            toplamAgirlik += agirlik;
        }
        return toplamAgirlik;
    }
}
