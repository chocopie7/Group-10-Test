package Kim;


public class Unit2program2 {
    public static void main(String[] args) {
        String original = "hello";
        String upper = original.toUpperCase();
        System.out.println("Original: " + original);
        System.out.println("Uppercase: " + upper);

        String copied = new String(original);
        System.out.println("Copied string: " + copied);

        Person p = new Person("Alice");
        String greeting = "Hello, " + p;
        System.out.println(greeting);

        System.out.println("Length: " + original.length());
        System.out.println("Substring(1, 4): " + original.substring(1, 4));
        System.out.println("Substring(2): " + original.substring(2));
        System.out.println("Index of 'l': " + original.indexOf("l"));
        System.out.println("Equals 'hello': " + original.equals("hello"));
        System.out.println("CompareTo 'world': " + original.compareTo("world"));

        String singleChar = original.substring(1, 2);
        System.out.println("Single char at index 1: " + singleChar);

        Integer intObj = new Integer(42);
        int num = intObj;
        Integer autoBoxed = num;
        System.out.println("Integer object: " + intObj);
        System.out.println("Unboxed int: " + num);
        System.out.println("Autoboxed Integer: " + autoBoxed);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);

        int fromIntObj = intObj.intValue();
        System.out.println("intValue from Integer object: " + fromIntObj);

        Double doubleObj = new Double(3.14);
        double d = doubleObj;
        Double autoBoxedD = d;
        System.out.println("Double object: " + doubleObj);
        System.out.println("Unboxed double: " + d);
        System.out.println("Autoboxed Double: " + autoBoxedD);
        System.out.println("doubleValue from Double object: " + doubleObj.doubleValue());

        System.out.println("abs(-5): " + Math.abs(-5));
        System.out.println("abs(-3.14): " + Math.abs(-3.14));
        System.out.println("pow(2, 3): " + Math.pow(2, 3));
        System.out.println("sqrt(16): " + Math.sqrt(16));

        int diceRoll = (int)(Math.random() * 6) + 1;
        System.out.println("Random dice roll (1-6): " + diceRoll);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person: " + name;
    }
}

