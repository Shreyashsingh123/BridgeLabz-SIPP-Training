public class PeakElement {
    public static int solve(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            boolean leftSmaller = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean rightSmaller = (mid == arr.length - 1 || arr[mid] > arr[mid + 1]);

            if (leftSmaller && rightSmaller) {
                return arr[mid]; // peak found
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; // should not reach here if input has at least one peak
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = solve(arr);
        System.out.println("Peak element: " + peak);
    }
}
