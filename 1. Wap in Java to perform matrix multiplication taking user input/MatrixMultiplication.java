//1. Wap in Java to perform matrix multiplication taking user input.

import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the first matrix: ");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        System.out.println("Enter the number of rows and columns for the second matrix: ");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] result = new int[rows1][cols2]; 
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix after multiplication: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

/*
Enter the number of rows and columns for the first matrix: 
2 3
Enter the number of rows and columns for the second matrix: 
3 2
Enter the elements of the first matrix: 
1 2 3
4 5 6
Enter the elements of the second matrix: 
7 8
9 10
11 12


Resultant Matrix after multiplication: 
58 64 
139 154

*/