import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Enter the element to search: ");
        int searchElement = sc.nextInt();
        int result = binarySearch(array, searchElement);
        if (result == -1) {
            System.out.println("Element " + searchElement + " not found in the array.");
        } else {
            System.out.println("Element " + searchElement + " found at position: " + (result + 1));
        }
        sc.close();
    }
    
    // Binary search method
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
/*
Enter the size of the array: 
6
Enter the elements of the array: 
10 7 3 5 2 8
Enter the element to search: 
5

*/