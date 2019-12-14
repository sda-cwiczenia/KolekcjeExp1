import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZbioryExm1 {
    public static void main(String[] args) {
        Set<String> imiona = new HashSet<>();
        String imie;

        Scanner pobierz = new Scanner(System.in);
        System.out.print("Podaj imie :");
        imie = pobierz.next();

        while (!imie.equals("q") && !imie.equals("Q")) {
            if (imiona.add(imie)) System.out.println("Dodałem element "+imie+" do zbioru");
            else System.out.println(imie+" już istnieje w zbiorze, nie dodaję");
            System.out.print("Podaj następne imie :");
            imie = pobierz.next();
        }

        System.out.println(imiona);


    }
}
