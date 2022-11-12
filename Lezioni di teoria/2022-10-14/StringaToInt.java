public class StringaToInt {
    public static void main(String[] args) {
        String numero = args[0];
        int valore = 0;

        for (int i = 0; i < numero.length(); i++)
            valore = valore * 10 + (numero.charAt(i) - '0');
    
        System.out.println(valore);
    }
}
