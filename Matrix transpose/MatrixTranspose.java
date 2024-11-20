import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] t = new int[cols][rows];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t[j][i] = a[i][j];
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(a, rows, cols);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(t, cols, rows);
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
Enter the number of rows: 2
Enter the number of columns: 3
Enter the elements of the matrix:
1 2 3
4 5 6
Original Matrix:
1 2 3
4 5 6
Transposed Matrix:
1 4
2 5
3 6
*/
