package ClassExercises;
import java.util.Scanner;

public class Matrix {

    /**
     * A method that prints a matrix
     *
     * @param param1 - Accept message for the print function
     * @param param2 - The matrix to be printed
     */
    public static void printFunction(String message, int[][] matrix) {
        System.out.println(message);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }


    /**
     * Accept input from users and store in a matrix
     *
     * @param param1 - Scanner to accept user input
     * @param param2 - String - Prompt for user input
     * @param param3 - Int - The array size
     * @return The matrix
     */
    public int[][] matrix(Scanner sc, String prompt, int arraySize) {
        int[][] matrix = new int[arraySize][arraySize];

            // loop through the matrix to accept user input
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    System.out.print(prompt + " for position [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }
            return matrix;
        }


        /**
         * Sums value of two matrixes and stores in another matrix
         *
         * @param param1 - First matrix to be calculated
         * @param param2 - Second matrix to be calculated
         * @param param3 - int - array size
         * @return the matrix sum
         */
        public int[][] matrixSum(int[][] matrixA, int[][] matrixB, int arraySize) {
            int[][] matrixSum = new int[arraySize][arraySize];
    
                // Loop through the matrix
                for(int i = 0; i < matrixSum.length; i++) {
                    for(int j = 0; j < matrixSum[i].length; j++) {
                        matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
                    }
                }
                return matrixSum;
            }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = 2;

        Matrix matrixInstance = new Matrix();
        int[][] matrixA = matrixInstance.matrix(sc, "Enter a new number for Matrix A", arraySize);
        System.out.println();
        int[][] matrixB = matrixInstance.matrix(sc, "Enter a new number for Matrix B", arraySize);
        System.out.println();
        int[][] matrixSum = matrixInstance.matrixSum(matrixA, matrixB, arraySize);
        printFunction("Matrix A: ", matrixA);
        printFunction("Matrix B: ", matrixB);
        printFunction("Matrix Sum: ", matrixSum);

        sc.close();

    }
}