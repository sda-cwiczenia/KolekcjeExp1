import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListaExm1 {
    public static void main(String[] args) {

        List<String> imiona = new ArrayList<>();
        String imie;

        File plik = new File("mojPlik.txt");
        Scanner pobierz = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        imie = pobierz.next();

        while (!imie.equals("q")) {
            imiona.add(imie);
            System.out.print("Podaj następne imie: ");
            imie = pobierz.next();
        }

//        for (String kolejneImie : imiona) {
//            System.out.println(kolejneImie);
//        }
        System.out.println(imiona);

    }
}
