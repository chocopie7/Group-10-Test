package Kim;

public class Unit6program1 {
    public static void main(String[] args) {
        int[] scores = {4, 5, 3, 4, 6, 4, 5, 3, 4};
        int total = 0;

        System.out.println("Hole Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Hole " + (i + 1) + ": " + scores[i]);
        }

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        double average = (double) total / scores.length;
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);

        System.out.println("Scores using enhanced for loop:");
        for (int score : scores) {
            System.out.println(score);
        }

        int min = scores[0];
        int max = scores[0];
        for (int score : scores) {
            if (score < min) min = score;
            if (score > max) max = score;
        }
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);

        boolean hasHoleInOne = false;
        for (int score : scores) {
            if (score == 1) {
                hasHoleInOne = true;
                break;
            }
        }
        System.out.println("Hole-in-one? " + hasHoleInOne);

        reverseArray(scores);
        System.out.println("Reversed Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        int[] emptyInts = new int[5];
        double[] emptyDoubles = new double[5];
        boolean[] emptyBooleans = new boolean[5];
        String[] emptyStrings = new String[5];

        System.out.println("Default int[0]: " + emptyInts[0]);
        System.out.println("Default double[0]: " + emptyDoubles[0]);
        System.out.println("Default boolean[0]: " + emptyBooleans[0]);
        System.out.println("Default String[0]: " + emptyStrings[0]);

        System.out.println("Accessing last index safely: " + scores[scores.length - 1]);

        shiftRight(scores);
        System.out.println("Scores after right shift:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void shiftRight(int[] arr) {
        if (arr.length == 0) return;
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
}
