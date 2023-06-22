package practice06.s01_polymorphism;

public class Medya {
    private String dosyaAdi;
    public void oynat (){
        System.out.println("Dosya oynatiliyor.");
        //System.out.println("Dosya calisiyor.");
    }

    public void durdur() {
        System.out.println("Dosya durduruluyor.");
    }

    public Medya(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
        System.out.println(this.dosyaAdi + " Bir obje olusturuldu");//this.dosyaAdi yerine dosyaAdi da yazabilirdik
        oynat();
    }

    public String getDosyaAdi() {
        return dosyaAdi;
    }

    public void setDosyaAdi(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    @Override
    public String toString() {
        return "DosyaAdi:\t" + dosyaAdi;
    }
}
