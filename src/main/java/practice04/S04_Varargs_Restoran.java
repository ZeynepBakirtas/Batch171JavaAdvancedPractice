package practice04;

import java.util.Arrays;

public class S04_Varargs_Restoran {
    /*
        Java programında, bir restoranın menüsündeki yemeklerin fiyatlarını hesaplayan bir metot yazmanız isteniyor.
        Metot, menüdeki yemeklerin isimlerini ve ardından fiyatlarını almalıdır.
        Menüdeki yemeklerin fiyatları toplamını döndüren ve menüye hiç yemek eklenmediğinde 0 döndüren bir metot yazın.
    */

    public static void main(String[] args) {
        double toplamFiyat = toplamFiyatHesapla("Corba", "15.99", "Salata", "22.65", "Pide", "35.99");
        System.out.println("Toplam fiyat: " + toplamFiyat + " TL");

    }

    public static double toplamFiyatHesapla (String... yemekler){//varargslar array gibi calisir
        double toplam = 0;
        System.out.println("...HARIKALAR DIYARI LOKANTASINA HOSGELDINIZ...");
        System.out.println("---------------------------");

        for (int i = 0; i < yemekler.length; i += 2) {
            String yemekAdi = yemekler[i];
            double yemekFiyati = Double.parseDouble(yemekler[i+1]);

            toplam += yemekFiyati;
            System.out.println(yemekAdi + " = " + yemekFiyati);
        }
        System.out.println("---------------------------");
        return toplam;
    }
}
