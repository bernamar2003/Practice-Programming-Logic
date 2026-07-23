package ContinueToLoop;
public class NestedContinueExample {
    public static void main(String[] args) {
        outerLoop: // Label for the outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 3 && j == 3) {
                    continue outerLoop; // Continue the outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Nested loop finished.");
    }
}