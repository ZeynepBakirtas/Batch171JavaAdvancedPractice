package practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S08_ArrayList_Menu {
    public static void main(String[] args) {
        /*
        Bir restoraın menüsüne eklenecek öğeleri kullanıcıdan alarak List'e ekleyin ve menüyü ekrana yazdırın.
        */
        Scanner input = new Scanner(System.in);

        List<String> menu = new ArrayList<>();

        String options;
        do {
            System.out.println("Menuye eklemek istediginiz yemek: ");
            String meal = input.nextLine();
            if (menu.contains(meal)){
                System.out.println(meal + " listede zaten var. Tekrar eklenemez.");
            } else {
                menu.add(meal);
                System.out.println(meal + " menuye eklendi");
            }

            System.out.println("Baska yemek eklemek ister misiniz (E/H): ");
            options = input.nextLine();
        } while (options.equalsIgnoreCase("E"));

        System.out.println("Restoran menusu: ");

        System.out.println(menu);

        for (String yemek: menu){
            System.out.println("- " + yemek);
        }
    }
}
