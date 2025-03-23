import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Reverse the array using a new array
        int[] reversedArr = reverseArrayUsingNewArray(arr);

        System.out.println("Reversed array: " + Arrays.toString(reversedArr));
    }

    // Method to reverse the array using a new array
    public static int[] reverseArrayUsingNewArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }
}