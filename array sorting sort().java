import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] myArray = {5, 2, 8, 3, 1, 6, 4};
        Arrays.sort(myArray);

        System.out.println("Sorted array:");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }
}
