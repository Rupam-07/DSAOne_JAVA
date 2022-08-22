import java.util.Scanner;

public class ClrNthbit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long num= sc.nextLong();
            int n= sc.nextInt();
            clrNth(num, n);
        }
    }
    static void clrNth(long num, int n){
    long mask=(~(1<<n-1));
    long res=(num & mask);
       System.out.println(res);

    }
}
