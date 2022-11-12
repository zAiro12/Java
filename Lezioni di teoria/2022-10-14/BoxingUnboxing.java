import java.util.ArrayList;
import java.util.List;

public class BoxingUnboxing {
    public static void main(String[] args) {
        List<Integer> numeri = new ArrayList<>();


        numeri.add(3);
        numeri.add(4);

        int somma = 0;
        for (Integer i : numeri) somma +=i;

        System.out.println(somma);
    }
}
