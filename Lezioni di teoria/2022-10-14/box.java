import java.util.ArrayList;
import java.util.List;

public class box {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(3);
        int iComePrimitivo = i.intValue();
        System.out.println(iComePrimitivo);

        List<Integer> numeri = new ArrayList<>();
        
        numeri.add(3);
        numeri.add(Integer.valueOf(4));

        int somma = 0;
        for(Integer cacca : numeri){
            somma += cacca.intValue();
        }
        System.out.println(somma);
    }
}
