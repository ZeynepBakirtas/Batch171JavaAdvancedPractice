package practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Odev2 {
    /*
        Kelime Tahmin Oyunu
        Kullanıcının bir kelimeyi harf harf tahmin ederek doğru kelimeyi bulmasını sağlayan bir oyun geliştirin.
        Oyun şu adımları içermelidir:

        - Bir kelime listesi tanımlayın. Bu listede en az 5 farklı kelime bulunsun.
        - Oyuncu, listeden rastgele seçilen bir kelimeyi tahmin etmeye çalışmalıdır.
        - Oyuncuya, seçilen kelimenin uzunluğu kadar alt tire "_" işaretinden  oluşan bir dizi gösterilmelidir.
          Örneğin, seçilen kelime "elma" ise "____" şeklinde bir gösterim yapılmalıdır.
        - Oyuncu, her tahmininde bir harf girmelidir.
            - Girdiği harf, seçilen kelimede bulunuyorsa, doğru tahmin olduğu belirtilmeli ve
              ilgili harf yerine konulmalıdır.
            - Oyuncu, yanlış tahminlerde bulunduğunda, kalan hakkı azalmalıdır.
              Başlangıçta oyuncunun 5 hakka sahip olduğu varsayılmalıdır.
        - Oyuncunun doğru kelimeyi bulması durumunda, tebrik mesajı gösterilmeli ve oyun sonlandırılmalıdır.
        - Oyuncunun kalan hakları sıfır olduğunda, olumsuz bir mesaj ve doğru kelime gösterilmelidir.
     */

    public static void main(String[] args) {
        String word[] = {"kiraz", "kayisi", "erik", "muz", "elma"};

        kelimeSec(word);

    }


    private static void kelimeSec(String[] word) {
        int intSayi = (int) (Math.random()*5);
        String kelime = word[intSayi];
        String ayrilmis[] = kelime.split("");
        System.out.println(kelime);


        String kelimeSayisi = "";
        for (int i = 0; i < kelime.length(); i++) {
                kelimeSayisi += "_";
        }

        System.out.println("Kelimenin uzunlugu: "+ kelime.length() + " harfli: " + kelimeSayisi);
        Scanner input = new Scanner(System.in);

        int counter = 5;
        do{
            System.out.println("Harfi giriniz");
            String harf = input.next();
            for (int i = 0; i < kelime.length(); i++) {
                if(ayrilmis[i].equalsIgnoreCase(harf)){
                    ayrilmis[i] = harf;
                    System.out.println(Arrays.toString(ayrilmis));
                } else {
                    System.out.println(counter + " hakkiniz kalmistir.");
                }
            }
            counter--;
        } while (counter>0);

    }
}

