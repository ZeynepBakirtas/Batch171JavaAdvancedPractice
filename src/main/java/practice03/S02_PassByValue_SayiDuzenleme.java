package practice03;

public class S02_PassByValue_SayiDuzenleme {
    public static void main(String[] args) {
        /*
        İçinde verilmiş bir sayının orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            int sayi = 42;
            - Sayıyı karesini alın.
            - Sayıyı küpünü alın.
            - Sayının karekökünü alın.
            - Sayının mutlak değerini alın.
            - Sayıyı 10 ile çarpın ve sonucu yazdırın.
    */
        int sayi = 42;
        System.out.println(sayi);//42

        int sayi2 = karesiniAl(sayi);//1764
        System.out.println(sayi2);

        kupunuAl(sayi);//74088
        karakokunuAl(sayi);
        mutlakAl(sayi);
        onCarpimi(sayi);
    }
    private static void onCarpimi(int deger) {
        deger *= 10;
        System.out.println(deger);
    }

    private static void mutlakAl(int deger) {
        deger = Math.abs(deger);
        System.out.println(deger);
    }

    private static void karakokunuAl(int deger) {
        deger = (int) Math.sqrt(deger);
        System.out.println(deger);
    }

    private static void kupunuAl(int deger) {
        deger = (int) Math.pow(deger, 3);
        System.out.println(deger);
    }

    private static int karesiniAl(int deger) {
        deger = (int) Math.pow(deger, 2);//Casting(explicit) yaptik
        return deger;
    }
}
