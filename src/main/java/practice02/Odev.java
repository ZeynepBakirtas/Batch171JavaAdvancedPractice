package practice02;

import java.util.Scanner;

public class Odev {
    /*
        Amaç:
        Oyuncudan 1 ile 100 arasında bir sayı tahmini alarak rastgele bir sayıyı bulmaya çalışması istenir.
        Oyuncuya her tahminde doğru sayıya yaklaşıp yaklaşmadığına dair ipuçları verilir ve oyuncuya 10 tahmin hakkı tanınır.

        Yönergeler:
        - Oyuncuya "1-100 arası bir sayı tahmini giriniz" mesajı gösterilir.
        - Oyuncu bir sayı girişi yapar.
        - Oyuncunun tahmini, rastgele seçilen sayıya göre kontrol edilir:
            - Tahmin doğru ise, "Tebrikler, X. tahminde sayıyı buldunuz!" mesajı gösterilir.
              Ardından oyuncunun puanı hesaplanır ve "Puanınız: X" mesajı gösterilir ve
              "Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın." mesajı gösterilir.
            - Tahmin, sayıdan küçük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha büyük bir sayı giriniz:" mesajı gösterilir.
            - Tahmin, sayıdan büyük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha küçük bir sayı giriniz:" mesajı gösterilir.
            - Oyuncuya 10 tahmin hakkı verilir. Oyuncu 10 tahmin hakkını da kullanırsa,
              "Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın."
              mesajı gösterilir.
            - Oyuncu 1'e basarsa, oyun yeniden başlatılır ve yeni bir rastgele sayı seçilir.
            - Oyuncu herhangi bir sayıya basarsa, oyun sona erer ve program sonlanır.
     */
    /*
    Scanner objesini her metot çağırdığında oluşturmak yerine class seviyesinde veya main metotta bir
    kere oluşturup kullanabilirsin. class'ta oluşturacaksan static yapabilirsin, main metotta kullanacaksan
    sayiTahmini metodunu parametreli yapabilirsin. Örneğin sayiTahmini(Scanner input)
     */
    public static void main(String[] args) {
        sayiTahmini();
        System.out.println("Yeniden bekleriz:)");

    }

    private static void sayiTahmini() {
        Scanner input = new Scanner(System.in);
        System.out.println("1-100 arası bir sayı tahmini giriniz");

        int random = (int) (Math.random() * 100)+1;

        for (int i = 1; i < 11; i++) {
            int suggestion = input.nextInt();
            if (suggestion == random) {
                System.out.println("Tebrikler, " + i + ". tahminde sayiyi buldunuz! \n" +
                        "Puaniniz: " + (10-i) * 10 + "\n" +
                        "Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın.");
                if (input.nextInt() == 1) {
                    sayiTahmini();
                } else {
                    break;
                }
            } else if (suggestion < random) {
                System.out.println("Bilemediniz, tahmin için " + (10 - i) + " hakkınız kaldı! Daha büyük bir sayı giriniz:");
            } else {
                System.out.println("Bilemediniz, tahmin için " + (10 - i) + " hakkınız kaldı! Daha küçük bir sayı giriniz:");
            }

            if (i==10){
                System.out.println("Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın.");
                if (input.nextInt() == 1) {
                    sayiTahmini();
                } else {
                    break;
                }
            }
        }
    }
}
