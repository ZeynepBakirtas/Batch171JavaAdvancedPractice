package practice05.s01_inheritance;

import java.time.LocalDate;

public class BankaYonetimiUygulamasi {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1985, 03,15);

        BireyselMusteriler bm = new BireyselMusteriler(
                "Ali Can",
                1234567,
                20000,
                "32149579352",
                dogumTarihi);

        System.out.println(bm.toString());

        bm.paraCekme(2000);

        KurumsalMusteriler km = new KurumsalMusteriler(
                "Zeynep Bakirtas",
                25324,
                1000,
                "3495749",
                "Yildiz Holding");
        System.out.println(km);

        km.paraYatirma(2000);
        //BireyselMusteriler bm2 = new BireyselMusteriler()
        //bm.musteriAdi = "Zeynep";
        //bm.hesapBakiyesi;

        //Eger konstructor kullanmasaydik degiskenleri ustteki gibi tek tek girecektik.
    }
}
