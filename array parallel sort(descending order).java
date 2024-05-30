import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        Integer[] myArray = {5, 2, 8, 3, 1, 6, 4};  // Use Integer instead of int

        // Parallel sort the array in descending order
        Arrays.parallelSort(myArray, Collections.reverseOrder());

        System.out.println("Parallel sorted array in descending order:");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }
}
