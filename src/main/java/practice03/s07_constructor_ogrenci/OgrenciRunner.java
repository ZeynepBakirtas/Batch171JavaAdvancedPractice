package practice03.s07_constructor_ogrenci;

public class OgrenciRunner {
    public static void main(String[] args) {

        Ogrenci student1 = new Ogrenci();
        student1.name = "Ali";
        student1.age = 10;
        student1.studentClas = 5;

        System.out.println(student1);

        Ogrenci student2 = new Ogrenci("Ahmet", 12, 7);
        System.out.println(student2);

        //Alıştırma: Bir öğrencinin adını ve sınıfını güncelleyin ve değerlerini ekrana yazdırın
        student2.name = "Mehmet";
        System.out.println(student2);//Name='Mehmet', age=12, studentClas=7}
    }
}
