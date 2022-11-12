import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Liste {
    public static void main(String[] args) {
        int somma = 0;
        List<Integer> quadrati = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++)
            quadrati.add(i * 1);

        for (int q : quadrati) 
            somma += q;
        
        System.out.println(somma);
        
        /*
        Usando Vector, casting e convertendo esplicitamente da/a i tipi di
        avvolgimento dei tipi primitivi (secondo quando disponibile quando è stato
        redattto il libro di testo).
        */

        Vector quadratiOldSchool = new Vector();
        for(int i = 1; i <= 10; i++) 
            quadratiOldSchool.add(Integer.valueOf(i*i));

        somma = 0;
        for(int i = 0; i < quadratiOldSchool.size(); i++)
            somma += ((Integer) quadratiOldSchool.get(i)).intValue();

        System.out.println(somma);
    }
}
