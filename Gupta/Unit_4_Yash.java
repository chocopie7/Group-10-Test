package Gupta;

public class Unit_4_Yash 
{
    public static void Part1(int num)
    {
        System.out.println("Part 1: ");

        int iteration = 5;
        
        while(iteration >= 0)
        {
            System.out.println(num);
            iteration--;
        }
    }



    public static void Part2(int num)
    {
        System.out.println("Part 2: ");

        for (int i = 5; i >= 0; i--)
        {
            System.out.println(num);
        }
    }

    public static int Part3(String str, char ch) 
    {
        System.out.println("Part 3: ");

        int count = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == ch) 
            {
                count++;
            }
        }
        System.out.println(count);

        return count;
    }

    public static void Part4() {
        System.out.println("Part 4: ");

        for (int i = 0; i < 3; i++) {               
            for (int j = 0; j < 3; j++) {           
                System.out.print("* ");
            }
            System.out.println();                 
        }
    }

    public static void main(String[] args) 
    {
        char target = 'g';
        Unit_4_Yash.Part1(5);
        Unit_4_Yash.Part2(5);
        Unit_4_Yash.Part3("asgjgag",target);
        Unit_4_Yash.Part4();



    }
}
