package practice01;

public class S03_Hipotenus {
    public static void main(String[] args) {

         /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */
        int a = 8;
        int b = 5;
        double karakok = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));//Karakok alma Math.sqrt methodu ile yapiliyor...
       // us alma methodu Math.pow

        System.out.println("Hipotenus = " + karakok);



    }
}
