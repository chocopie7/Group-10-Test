package Finney;

public class FactorialTracing {
    private static int depth = 0;

    public static void main(String[] args) {
        System.out.println("=== Recursive Factorial Tracing ===");
        int result = factorial(5);
        System.out.println("\nFinal result: " + result);
    }

    public static int factorial(int n) {
        printTrace("Entering factorial(" + n + ")");
        
        if (n <= 1) {
            printTrace("Base case reached (n <= 1)");
            printTrace("Returning 1");
            depth--;
            return 1;
        }
        
        int recursiveResult = factorial(n - 1);
        int result = n * recursiveResult;
        
        printTrace("Calculating " + n + " * " + recursiveResult + " = " + result);
        printTrace("Returning " + result);
        
        depth--;
        return result;
    }

    private static void printTrace(String message) {
      
        StringBuilder indentBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indentBuilder.append("  ");
        }
        String indent = indentBuilder.toString();
        
        System.out.println(indent + message);
        
        if (!message.startsWith("Returning") && !message.contains("Base")) {
            depth++;
        }
    }
}