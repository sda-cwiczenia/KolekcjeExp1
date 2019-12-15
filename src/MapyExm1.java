import java.util.*;

public class MapyExm1 {

    static boolean panstwoJestWBazie(Map<String, String> mapa, String panstwo) {
        return mapa.containsKey(panstwo);
    }

    static boolean dodajPanstwo(Map<String, String> mapa, String panstwo, String stolica) {
        if (mapa.containsKey(panstwo)) {
            System.out.println("Takie państwo już istnieje w bazie");
            return false;
        } else {
            mapa.put(panstwo, stolica);
            return true;
        }
    }

    static void pokazListePanstwStolic(Map<String, String> mapa) {
        for (String panstwo : mapa.keySet()) {
            System.out.println(panstwo + " : " + mapa.get(panstwo));
        }
    }

    public static void main(String[] args) {
        Map<String, String> mapaPanstw = new HashMap<>();
        String panstwo;
        String stolica;

        Scanner pobierz = new Scanner(System.in);
        int wybor;

//        do {
//            menu();
//            wybor = pobierz.nextInt();
//        } while (wybor != 4);
//        System.out.println("Dziękujemy za współpracę");
        do {
            menu();
            wybor = pobierz.nextInt();
            switch (wybor) {
                case 1:
                    //System.out.println("Tu będzie dodawanie");
                    System.out.print("Podaj państwo :");
                    panstwo = pobierz.next();
                    System.out.print("Podaj stolicę :");
                    stolica = pobierz.next();
                    dodajPanstwo(mapaPanstw, panstwo, stolica);
                    break;
                case 2:
                    System.out.println("Tu będzie usuwanie");
                    System.out.println("Podaj państwo do usunięcia :");
                    panstwo = pobierz.next();
                    usunPanstwo(mapaPanstw, panstwo);
                    break;
                case 3:
                    System.out.println("Tu będzie zmiana stolicy");
                    break;
                case 4:
                    pokazListePanstwStolic(mapaPanstw);
                default:
                    ;
            }

        } while (wybor != 5);
        System.out.println("Koniec programu");


    }

    static boolean usunPanstwo(Map<String, String> mapa, String panstwo) {
        if (mapa.containsKey(panstwo)) {
            mapa.remove(panstwo);
            return true;

        } else {
            System.out.println("Podanego państwa nie ma w bazie");
            return false;
        }
    }

    static void menu() {
        System.out.println("***********************");
        System.out.println("Program PAŃSTWA-STOLICE");
        System.out.println(" --- wybierz jedną z opcji ----");
        System.out.println("1. Dodaj państwo i jego stolicę");
        System.out.println("2. Usuń państwo z bazy danych");
        System.out.println("3. Zmień stolicę");
        System.out.println("4. Pokaż listę państw i stolic");
        System.out.println("5. Zakończ");

    }


}
