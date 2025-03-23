public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = calculateSum(array);
        System.out.println("The sum of all elements in the 2D array is: " + sum);
    }

    public static int calculateSum(int[][] array) {
        int sum = 0;

        // Enhanced for loop to iterate through rows
        for (int[] row : array) {
            // Enhanced for loop to iterate through columns in the current row
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
    }
}