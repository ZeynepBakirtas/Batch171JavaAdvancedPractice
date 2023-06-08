package practice03.s07_constructor_ogrenci;

public class Ogrenci {

    //class lar objelerin kaliplaridir. Objeler classlarin ozelliklerini tasir.
    /*
        Ogrenci class'ı, öğrencinin adını, yaşını ve sınıfını temsil eden alanları içermelidir.
        Bu class'ın ir default constructor'ı, bir de parametreli constructor'ı olmalıdır.
        Bu class'ın değiken değerlerini ekrana yazdıran bir metot bulunmalıdır.
    */
    public String name;// default --> package private (Pakete Ozel)
    public int age;
    public int studentClas;



    public Ogrenci() {//parametresiz constructor
        name = "";
        age = 0;
        studentClas = 0;
    }

    public Ogrenci(String name, int age, int studentClas) {
        this.name = name;
        this.age = age;
        this.studentClas = studentClas;
    }

    @Override
    public String toString() {
        return
                "Name='" + name + '\'' +
                ", age=" + age +
                ", studentClas=" + studentClas +
                '}';
    }
    //POJO CLASS
}
