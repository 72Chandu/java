import java.util.Scanner;

public class QuickSort {

    // Method to partition the array
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choosing the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (array[j] < pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // The main method that implements Quick Sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the pivot index
            int pi = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Utility method to print the array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size as input
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Taking array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(array);

        // Sorting the array
        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        printArray(array);
        
        scanner.close();
    }
}
/*
Enter the number of elements in the array: 6
Enter the elements of the array:
10 7 8 9 1 5
Original array:
10 7 8 9 1 5 
Sorted array:
1 5 7 8 9 10 

*/
        