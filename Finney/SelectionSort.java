package Finney;

import java.util.ArrayList;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5); numbers.add(9); numbers.add(7); numbers.add(2); numbers.add(1);
        
        System.out.println("Original: " + numbers);
        selectionSort(numbers);
    }

    public static void selectionSort(ArrayList<Integer> list) {
        for(int i=0; i<list.size(); i++) {
            int minIndex = i;
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
            
            System.out.println("Step " + (i+1) + ": Swap " + temp + " ↔ " + list.get(i) + " → " + list);
        }
    }
}