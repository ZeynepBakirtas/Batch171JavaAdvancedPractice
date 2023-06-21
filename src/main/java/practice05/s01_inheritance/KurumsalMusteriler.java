package practice05.s01_inheritance;

public class KurumsalMusteriler extends Musteri {

    String vergiNo;
    String sirketAdi;


    public KurumsalMusteriler(String musteriAdi, int musteriNo, double hesapBakiyesi, String vergiNo, String sirketAdi) {
        super(musteriAdi, musteriNo, hesapBakiyesi);
        this.vergiNo = vergiNo;
        this.sirketAdi = sirketAdi;
    }

    @Override
    public String toString() {
        return "KurumsalMusteriler: " +
                super.toString() +
                "\n\tVergi No: " + vergiNo +
                "\n\tSirket Adi: " + sirketAdi;
    }
}
