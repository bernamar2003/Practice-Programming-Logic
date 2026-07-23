/*In this example:

We have an array of userIds.

We iterate through the array using a for-each loop.

Inside the loop, we check if userId is less than or equal to 0.
If so, we execute the continue statement, which skips the current iteration and moves on to the next userId.

Consequently, only valid (positive) userIds are processed, and invalid ones are ignored. */

package ContinueToLoop;

public class ProcessUserIds {
    public static void main(String[] args) {
        int[] userIds = {101, -5, 205, 0, 302, -1, 400};

        for (int userId : userIds) {
            if (userId <= 0) {
                continue; // Skip invalid user IDs
            }
            System.out.println("Processing user ID: " + userId);
            // Add your user processing logic here
        }
        System.out.println("User ID processing finished.");
    }
}
