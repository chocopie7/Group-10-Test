package Finney;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
            3, 7, 14, 7, 13, 2, 16, 13, 15, 2
        ));
        
        System.out.println("Original array: " + numbers);
        
        // Phase 1: Complete all splits first
        List<List<Integer>> splitQueue = new ArrayList<>();
        splitQueue.add(numbers);
        performAllSplits(splitQueue);

        // Show final split array
        System.out.println("\n=== Final Split Array ===");
        System.out.println(splitQueue);

        // Phase 2: Perform all merges
        performAllMerges(splitQueue);
        
        System.out.println("\nFinal sorted array: " + splitQueue.get(0));
    }

    // Split phase (all splits happen first)
    private static void performAllSplits(List<List<Integer>> queue) {
        System.out.println("\n=== Splitting Phase ===");
        boolean needsSplitting = true;
        
        while (needsSplitting) {
            needsSplitting = false;
            int initialSize = queue.size();
            
            for (int i = 0; i < initialSize; i++) {
                List<Integer> current = queue.remove(0);
                if (current.size() > 1) {
                    int mid = current.size() / 2;
                    List<Integer> left = new ArrayList<>(current.subList(0, mid));
                    List<Integer> right = new ArrayList<>(current.subList(mid, current.size()));
                    
                    System.out.println("Split: " + current + " -> " + left + " | " + right);
                    queue.add(left);
                    queue.add(right);
                    needsSplitting = true;
                } else {
                    queue.add(current);
                }
            }
        }
    }

    // Merge phase (all merges happen after)
    private static void performAllMerges(List<List<Integer>> queue) {
        System.out.println("\n=== Merging Phase ===");
        while (queue.size() > 1) {
            List<Integer> left = queue.remove(0);
            List<Integer> right = queue.remove(0);
            List<Integer> merged = new ArrayList<>();
            
            int i = 0, j = 0;
            while (i < left.size() && j < right.size()) {
                if (left.get(i) <= right.get(j)) {
                    merged.add(left.get(i++));
                } else {
                    merged.add(right.get(j++));
                }
            }
            while (i < left.size()) merged.add(left.get(i++));
            while (j < right.size()) merged.add(right.get(j++));
            
            System.out.println("Merge: " + left + " + " + right + " -> " + merged);
            queue.add(merged);
        }
    }
}