package Finney;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SearchComparison {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate and sort list once
        for(int i = 0; i < 15; i++) {
            numbers.add(rand.nextInt(50) + 1);
        }
        Collections.sort(numbers);
        
        System.out.println("Sorted list: " + numbers);
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        System.out.println("\n=== Linear Search ===");
        int linearSteps = linearSearch(numbers, target);
        
        System.out.println("\n=== Binary Search ===");
        int binarySteps = binarySearch(numbers, target);

        System.out.println("\nResults:");
        System.out.println("Linear Search steps: " + linearSteps);
        System.out.println("Binary Search steps: " + binarySteps);

        scanner.close();
    }

    public static int linearSearch(ArrayList<Integer> list, int target) {
        int steps = 0;
        for(int i = 0; i < list.size(); i++) {
            steps++;
            System.out.printf("Step %2d: Checking index %2d (%2d)%n", steps, i, list.get(i));
            if(list.get(i) == target) {
                System.out.println("Found at index: " + i);
                return steps;
            }
        }
        System.out.println("Not found");
        return steps;
    }

    public static int binarySearch(ArrayList<Integer> list, int target) {
        int low = 0, high = list.size()-1, steps = 0;
        
        while(low <= high) {
            steps++;
            int mid = low + (high - low)/2;
            int midVal = list.get(mid);
            
            System.out.printf("Step %2d: Low=%2d (%2d), High=%2d (%2d), Mid=%2d (%2d)%n",
                    steps, low, list.get(low), high, list.get(high), mid, midVal);
            
            if(midVal < target) {
                low = mid + 1;
            } else if(midVal > target) {
                high = mid - 1;
            } else {
                System.out.println("Found at index: " + mid);
                return steps;
            }
        }
        System.out.println("Not found");
        return steps;
    }
}