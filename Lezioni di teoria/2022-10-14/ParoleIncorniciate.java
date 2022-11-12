import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParoleIncorniciate {
    public static void main(String[] args) {
        char giustificazione = args[0].charAt(0);
        List<String> parole = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        
        int maxLen = 0;
        while(s.hasNext()){
            String parola = s.next();
            if(parola.length() > maxLen)
                maxLen = parola.length();
            parole.add(parola);
        }

        for(int i = 0; i < maxLen+4; i++)
            System.out.print("*");
        System.out.println();

        for (String parola : parole) {
            int prima = 0, dopo = 0, spazi = maxLen -parola.length();
            switch(giustificazione){
                case 'L':
                    dopo = spazi;
                    break;
                case 'C':
                    prima = spazi/2;
                    dopo = spazi - prima;
                    break;
                case 'R':
                    prima = spazi;
                    break;
            }
            System.out.print("* ");
            for (int j = 0; j<prima; j++)
                System.out.print(" ");
            System.out.print(parola);
            for (int j = 0; j<dopo; j++)
                 System.out.print(" ");
            System.out.println(" *");
        }
        
        for (int i = 0; i < maxLen + 4; i++) System.out.print('*');
        System.out.println();
    }
}
