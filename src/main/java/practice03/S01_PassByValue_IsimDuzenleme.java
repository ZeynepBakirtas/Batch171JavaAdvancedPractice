package practice03;

public class S01_PassByValue_IsimDuzenleme {
    public static void main(String[] args) {
        /*
        String içinde verilmiş bir ismin orjinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            String isim = "Ali Veli Can";
            - Tüm harleri büyük yapın.
            - Tüm harfleri küçük yapın.
            - İsmin başına ünvan ekleyin.
            - Sadece ilk isim ve soyismi yazın ve orta ismi kısaltarak yazın (Örnek: Ali V. Can)
            - İsmin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
    */
        //son ikisi odev
        String isim = "Ali Veli Can";
        String unvan = "Dr.";
        System.out.println(isim);

        allBig(isim);
        allShort(isim);
        unvanEkle(unvan, isim);

        //Bir methodda birden fazla is yapmasin. Tek is yapilmasina dikkat edilmeli

    }
    private static void allBig (String value) {
        value = value.toUpperCase();
        System.out.println(value);
    }

    private static void allShort (String value) {
        value = value.toLowerCase();
        System.out.println(value);
    }

    private static void unvanEkle (String unvan, String value) {
        System.out.println(unvan + " " + value);
    }
}
