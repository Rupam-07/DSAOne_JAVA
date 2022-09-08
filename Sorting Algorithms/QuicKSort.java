import java.util.Scanner;

public class QuicKSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            quickSort(arr, 0, n - 1);

            for (int i : arr)
                System.out.print(i + " ");
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high); // p is partitioning index
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }

    }

    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high]; // pivot element
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++; // increment index of smaller element
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return (i + 1);

    }
}
