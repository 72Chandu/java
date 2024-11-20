public class BoundaryElements {

    public static void printBoundaryElements(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Print the top row
        for (int i = 0; i < cols; i++) {
            System.out.print(matrix[0][i] + " ");
        }

        // Print the right column (excluding the corners)
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }

        // Print the bottom row if there is more than one row
        if (rows > 1) {
            for (int i = cols - 1; i >= 0; i--) {
                System.out.print(matrix[rows - 1][i] + " ");
            }
        }

        // Print the left column if there is more than one column (excluding the corners)
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Boundary elements of the matrix:");
        printBoundaryElements(matrix);
    }
}
//Boundary elements of the matrix: 1 2 3 4 8 12 16 15 14 13 9 5
