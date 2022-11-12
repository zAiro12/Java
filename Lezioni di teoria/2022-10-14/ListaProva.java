import java.util.ArrayList;
import java.util.List;

public class ListaProva {
    public static void main(String[] args) {
        String[] paroleComeArray = new String[2];
        List<String> parole = new ArrayList<>();

        parole.add("pippo");
        parole.add("pluto");
        parole.add("pippa");

        paroleComeArray[0] = "Luca";
        paroleComeArray[1] = "michi";

        System.out.println(parole);

        for (String parola : parole) {
            System.out.println(parola);
        }
    }
}