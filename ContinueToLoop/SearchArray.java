/*In this example:

We have an array of `number` elements and a `target` value that we want to find in that array.

We iterate through the array using a `for-eachloop`.
Inside the loop, we check if the current `number` is equal to `target`.
If so, we set the `found` flag to `true` and execute the `break` statement to exit the loop.

After the loop, we check the value of the `found` flag to determine if the `target` element was found in the array 
and print an appropriate message. */

package ContinueToLoop;
public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break; // Exit the loop once the target is found
            }
            System.out.println("Checking number: " + number);
        }

        if (found) {
            System.out.println("Target " + target + " found in the array.");
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}