import java.util.Scanner;

public class NonRepeating {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int res=check(arr,n);
            System.out.println(res);
        }
    }    
    static int check (int arr[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            res=res^arr[i]; //Using XOR
        }

        return res;
        
    }
}
