import java.util.Scanner;

public class Lychrel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        printLychrelSequence(in.nextLong());
    }

    public String revesal(String s) {
        if (s.length() <= 1)
            return s;
        return s.charAt(s.length() - 1) + revesal(s.substring(1, s.length() - 1)) + s.charAt(0);
    }

    public boolean isPali(String s) {
        return true;
    }

    public String numToString(long n) {
        return n + "";
    }

    public long stringToNum(String s){
        long n =0;
        for(int i = 0; i<s.length(); i++){
            n*=10;
            n+=s.charAt(i) - '0'; 
        }
        return n;
    }

void printLychrelSequence(long n){
        while(!isPali(numToString(n))){
            System.out.println(n);
            n+=stringToNum(revesal(numToString(n)));
        }
        System.out.println(n);
    }
}