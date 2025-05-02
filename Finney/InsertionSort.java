package Finney;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5); numbers.add(9); numbers.add(7); numbers.add(2); numbers.add(1);
        
        System.out.println("Original: " + numbers);
        insertionSort(numbers);
    }

    public static void insertionSort(ArrayList<Integer> list) {
        for(int i=1; i<list.size(); i++) {
            int key = list.get(i);
            int j = i-1;
            
            while(j >= 0 && list.get(j) > key) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, key);
            
            System.out.println("Step " + i + ": Insert " + key + " → " + list);
        }
    }
}