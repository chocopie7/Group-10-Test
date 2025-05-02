package Kim;

import java.util.Arrays;

public class Unit10program2 {
    public static void main(String[] args) {
        int[] numbers = {13, 7, 9, 21, 5, 3, 11, 15};
        Arrays.sort(numbers);
        int target = 11;
        int index = binarySearch(numbers, target, 0, numbers.length - 1);
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
        System.out.println("Searching for " + target + ": " + (index >= 0 ? "Found at index " + index : "Not found"));
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarySearch(arr, target, low, mid - 1);
        return binarySearch(arr, target, mid + 1, high);
    }
}