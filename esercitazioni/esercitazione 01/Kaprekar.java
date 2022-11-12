import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        sc.close();
        stampa(numToArray(n, (byte) 4));
    }

    public static byte[] numToArray(short n, byte digits) {
        byte[] arr = new byte[digits];
        for (int i = 0; i < digits; i++) {
            arr[i] = (byte) (n % 10);
            n = (short)(n / 10);
        }
        return arr;
    }

    void reverse(byte[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            byte tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
    }

    static void stampa(byte[] n) {
        for (byte x : n) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

/*
 * short arrayToNum(byte[] a){
 * 
 * }
 * 
 * 
 * short step(short n){
 * 
 * }
 * 
 * 
 */