package practice05.s02_abstraction;

public abstract class Course {//kisirlastik artik obje olusturamayiz
    String dersAdi;
    String ogretmenAdi;
    int dersSaati;
    double kursUcreti;

    public abstract String kategoriAdi();
}
