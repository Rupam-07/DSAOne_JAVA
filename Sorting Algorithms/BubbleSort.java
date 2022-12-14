import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            bubbleSort(arr, n);
        }

    }

    public static void bubbleSort(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            boolean swap=false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap=true;
                    // swap using a temp
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!swap){
               
                break;
            }
        }

        for(int i:arr)
            System.out.print(i);
    }

}
