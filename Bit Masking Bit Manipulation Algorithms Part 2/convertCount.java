import java.util.Scanner;

public class convertCount {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
    
            count(a,b);
        }

    }
    /**
     * @param a
     * @param b
     */
    static void count(int a, int b){
        int x= a^b;
        // System.out.println(x);
       
        // System.out.println(Integer.bitCount(x));

        int count = 0;
        while (x != 0) {
            count++;
            x =x&(x-1);
        }
        System.out.println(count);
    }
}
