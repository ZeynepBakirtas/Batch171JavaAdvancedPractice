package practice05.s01_inheritance;

public class Musteri {
    String musteriAdi;
    int musteriNo;
    double hesapBakiyesi;

    public Musteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void paraYatirma (double para) {
        hesapBakiyesi += para;
        System.out.println("Hesabiniza " + para + " TL eklenmistir.");
        System.out.println("Yeni hesap bakiyeniz: " + hesapBakiyesi + " TL'dir");
    }

    public void paraCekme(double para){

        if (hesapBakiyesi >= para){
            hesapBakiyesi -= para;
            System.out.println("Hesabinizdan " + para + " TL cekilmistir");
            System.out.println("Yeni hesap bakiyeniz: " + hesapBakiyesi + " TL'dir");
        } else {
            System.out.println("Hesap bakiyeniz yeterli degildir.");
            System.out.println("Hesabinizda " + hesapBakiyesi + " TL bulunmaktadir.");
        }

    }

    @Override
    public String toString() {
        return  "\n\tMusteri Adi: " + musteriAdi +
                "\n\tMusteri No: " + musteriNo +
                "\n\tHesap Bakiyesi: " + hesapBakiyesi;
    }
}
