public class SortClass {
    public static void BubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Print the current element being processed
            System.out.println("Processing element at index " + i + ": " + arr[i]);
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Print the comparison
                    System.out.println(arr[j] + " is compared with " + arr[j + 1]);
                    // swapp
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    // Print the swap
                    System.out.println(arr[j] + " is swapped with " + arr[j + 1]);
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds
            // the minimum element
            int minIndex = i;
            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    // Update min_idx if a smaller element
                    // is found
                    minIndex = j;
                }
            }
            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void InsertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void mergeSort(int[] arr, int left, int right){

    }

    // private static void merge(int[] arr, int left, int mid, int right){
    //     int n1 = mid - left + 1;
    //     int n2 = right - mid;
    // }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 2, 4 };
        InsertionSort(arr);
        for (int num : arr)
            System.out.println(num + " ");
    }
}
