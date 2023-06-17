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

        int num = (int) (Math.random() * 5);
        String istenilenKelime = word[num];
        String letter[] = istenilenKelime.split("");//istenilen kelimeyi harflere ayirdik
        System.out.println(istenilenKelime);

        String cizgi[] = new String[istenilenKelime.length()];
        Arrays.fill(cizgi, "_"); //istenilen kelimenin harfleri kadar cizgi olusturduk

        System.out.print("Kelimenin uzunlugu: " + istenilenKelime.length() + " harfli: ");
        for (String str : cizgi) {
            System.out.print(str + " ");
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        int counter = 5;

        do {
            System.out.println("Harf giriniz...");
            String girilenHarf = input.next().toLowerCase().substring(0, 1);

            for (int i = 0; i < cizgi.length; i++) {
                if (letter[i].equals(girilenHarf)) {
                    cizgi[i] = girilenHarf;//Dogru harf girdiginde bulundugu index deki cizgiye ata
                    System.out.println("Dogru harf girdiniz: " + Arrays.toString(cizgi));
                }
            }

            if (cizgi.equals(letter)) {
                System.out.println("Tebrikler oyunu basariyla bitirdiniz...");
                break;
            }

            if (!istenilenKelime.contains(girilenHarf)) {
                counter--;
                System.out.println(counter + " hakkiniz kalmistir.");
                if (counter == 0) {
                    System.out.println("Maalesef bu sefer bilemediniz :( bir dahaki sefer basaracaginiza inaniyoruz: " + word);
                    break;
                }
            }
        } while (counter > 0);
    }
}

