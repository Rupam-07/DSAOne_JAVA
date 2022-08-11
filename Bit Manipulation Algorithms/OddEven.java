import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int n=Sc.nextInt();
        System.out.println(isOdd(n)==true ? "Odd" : "Even");

        // if((n & 1) == 0){ faster than n%2
        //     System.out.println("even");
        // }else{
        //     System.out.println("Odd");
        // }
    }

     static boolean isOdd(int n){
        if((n & 1)==0) return false;
        else return true;

    }
}
