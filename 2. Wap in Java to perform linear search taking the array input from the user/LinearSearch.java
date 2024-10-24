import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int searchElement = sc.nextInt();
        boolean found = false;
        int position = -1; 
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                found = true;
                position = i;
                break;  
            }
        }
        if (found) {
            System.out.println("Element " + searchElement + " found at position: " + (position + 1));
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
        sc.close();
    }
}
/*
Enter the size of the array: 
5
Enter the elements of the array: 
12 34 54 2 93
Enter the element to search: 
54

*/
