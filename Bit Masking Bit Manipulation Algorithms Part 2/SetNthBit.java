import java.util.Scanner;

public class SetNthBit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long num= sc.nextLong();
            int n= sc.nextInt();
            setNth(num, n);
        }
    }
    static void setNth(long num, int n){
       long mask=1<<n;

       long res = num | mask;
       System.out.println(res);

    }
}
