package practice01;

public class S05_Sayiyi_Basamaklarina_Ayirma {
    public static void main(String[] args) {

         /*
        Bir tamsayıyı basamaklarına ayıran bir kod yazınız.
        İpucu: / ve % kullanınız
        Sayı: 12345
        Çıktı: 5
               4
               3
               3
               1
    */

        int sayi = 12345;

        int s1 = sayi % 10;
        int s2 = (sayi / 10) % 10;
        int s3 = (sayi / 100) % 10;
        int s4 = (sayi / 1000) % 10;
        int s5 = sayi / 10000;

        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5);
    }
}
