public class SelectionSort {
    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp; // fixed typo (arry → arr)
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop: iterate over each position
        for (int i = 0; i < n - 1; i++) {  
            int min_idx = i;

            // Inner loop: find index of minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum with the element at i
            if (min_idx != i) {
                swap(arr, i, min_idx);
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        selectionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
