import java.util.Arrays;

public class EmployeIdsorting {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];     
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {103, 101, 107, 104, 102, 106};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
