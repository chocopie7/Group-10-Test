public class PrimitiveTypes{
    public static void main(String[] args){
        //1.2: variable declaration and data types
        int apples = 5;
        double pricePerApple = 0.60;

        //1.3 expressions and assignment
        double totalCost = apples * pricePerApple;

        //1.4 compound assignment
        apples += 3;

        //1.5 Casting and ranges
        double newTotalCost = apples * pricePerApple;
        int costAsInt = (int) newTotalCost;

        //1.1 Output and understanding program behavior
        System.out.println("Total cost (before more apples): $" + totalCost);
        System.out.println("Apples after buying more: " + apples);
        System.out.println("New total cost: $" + newTotalCost);
        System.out.println("New total cost as integer (cast): $" + costAsInt);

    }
}