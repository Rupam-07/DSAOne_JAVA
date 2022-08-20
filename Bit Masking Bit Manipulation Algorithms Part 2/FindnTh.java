import java.util.Scanner;

public class FindnTh {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Long num=sc.nextLong();
            int i=sc.nextInt();
            getNth(num, i);
        }
    } 
    
    static void getNth(long num, int i){
       long mask = 1<<i-1;
       System.out.println(mask);
        
       if((num & mask)==0){
        System.out.println("it's 0");
       }else{
        System.out.println("it's 1");
       }

    }
}
