package practice06.s01_polymorphism;

public class MedyaOynatici {
    public static void main(String[] args) {
        Medya medya = new Medya("Ses dosyasi.mp3");

        System.out.println("Medya: " + medya.toString());

        Medya medya1 = new Medya("Ses dosyasi2.mp3");
        System.out.println("medya1: " + medya1);

        medya.setDosyaAdi("Sadece Sitem.mp3");
        System.out.println("Medya: " + medya);



    }
}
