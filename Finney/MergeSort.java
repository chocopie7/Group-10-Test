package Finney;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        
        // Generate 10 random numbers between 1-20
        for(int i=0; i<10; i++) {
            numbers.add(rand.nextInt(20) + 1);
        }
        
        System.out.println("Original: " + numbers);
        mergeSort(numbers);
    }

    public static void mergeSort(ArrayList<Integer> list) {
        if(list.size() < 2) return;
        
        int mid = list.size()/2;
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(list.subList(mid, list.size()));
        
        System.out.println(left + " " + right); // Split step
        
        mergeSort(left);
        mergeSort(right);
        merge(list, left, right);
        
        System.out.println(list); // Merged result
    }

    private static void merge(ArrayList<Integer> result, 
                            ArrayList<Integer> left, 
                            ArrayList<Integer> right) {
        int i=0, j=0, k=0;
        
        while(i < left.size() && j < right.size()) {
            if(left.get(i) < right.get(j)) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }
        
        while(i < left.size()) result.set(k++, left.get(i++));
        while(j < right.size()) result.set(k++, right.get(j++));
    }
}