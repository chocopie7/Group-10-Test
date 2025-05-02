package Gupta;

public class Unit_8_Yash 
{
    public static void part1() {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("First element: " + numbers[0][0]); 
    }

    public static void part2() {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[0].length; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Part 1: ");
        Unit_8_Yash.part1();
        System.out.println("Part 2: ");
        Unit_8_Yash.part2();
    }

}