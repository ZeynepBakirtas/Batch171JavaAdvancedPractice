package practice03;

import java.util.Arrays;

public class S03_PassByValue_ArrayDuzenleme {
    public static void main(String[] args) {
        /*
        Bir isimler arrayi içinde verilmiş bir ismin orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            String[] isimler = {"Ali Veli Can", "Mehmet Ahmet Bulut", "Ayşe Fatma Tepe"};
            - Her bir ismin tüm harflerini büyük yapın.
            - Her bir ismin tüm harflerini küçük yapın.
            - Her bir ismin başına ünvan ekleyin.
            - Her bir isimde sadece ilk isim ve soyismi yazın ve orta ismi kısaltarak yazın (Örnek: Ali V. Can)
            - Her bir ismin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
    */
        String[] isimler = {"Ali Veli Can", "Mehmet Ahmet Bulut", "Ayşe Fatma Tepe"};
        String unvan = "Dr.";
        buyukHarf(isimler);
        kucukHarf(isimler);
        System.out.println(Arrays.toString(isimler));
        unvanEkle(unvan, isimler);

    }

    private static void unvanEkle(String unvan, String[] arr) {
        for (String w: arr){
            w = unvan + " " +  w;
            System.out.print(w + ", ");
        }
        System.out.println();
    }

    private static void buyukHarf(String[] arr) {
        for (String w: arr){
            w = w.toLowerCase();
            System.out.print(w + ", ");
        }
        System.out.println();
    }

    private static void kucukHarf(String[] deger) {
        for (int i = 0; i < deger.length; i++) {
            deger[i] = deger[i].toUpperCase();
        }
        System.out.println(Arrays.toString(deger));
    }
}
