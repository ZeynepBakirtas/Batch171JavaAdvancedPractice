package practice03;

public class S05_MethodOverloading_Kargo {
    public static void main(String[] args) {
        /*
        İki farklı method oluşturun.
          - İlk method, bir paketin ağırlığını parametre olarak alacak ve kargo ücretini hesaplayıp döndürecek.
          - İkinci method ise bir paketin ağırlığı ve boyutları parametrelerini alacak ve
            bu bilgilere göre kargo ücretini hesaplayıp döndürecek.
        Bu methodları kullanarak farklı paketlerin kargo ücretlerini hesaplayın.
    */

        double kargoUcreti1 = kargoUcretiHesapla(7.2);
        System.out.println("kargoUcreti1 = " + kargoUcreti1);

        double kargoUcreti2 = kargoUcretiHesapla(11.5, 6.7);
        System.out.println("kargoUcreti2 = " + kargoUcreti2);
    }

    private static double kargoUcretiHesapla(double agirlik, double boyut) {
        double kargoUcreti = agirlik * 3.5 + boyut * 1.5;
        return kargoUcreti;
    }

    private static double kargoUcretiHesapla(double agirlik) {
        double kargoUcreti = agirlik * 3.5;
        return kargoUcreti;
    }
}
