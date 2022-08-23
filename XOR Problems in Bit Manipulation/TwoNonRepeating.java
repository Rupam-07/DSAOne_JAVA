import java.util.Scanner;

public class TwoNonRepeating {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        find(n,arr);
    }
    static void find(int n,int arr[]){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum^arr[i];
        }

        int ans1=0,ans2=0;

        for(int i=0;i<n;i++){
            if((sum^arr[i])>0){
                ans1=sum^arr[i];            
        }
    }
    ans2=ans1^sum;
    System.out.println(ans1 + " "+ ans2);

    }
}
