import java.util.Arrays;
import java.util.Scanner;

public class UseCase19TrainConsistMgmnt {

    // Binary Search Method
    public static boolean binarySearchBogie(String[] bogieIds, String key) {

        // Edge case: empty array
        if (bogieIds.length == 0) return false;

        // Ensure sorted input (important precondition)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Found
            } 
            else if (comparison < 0) {
                low = mid + 1; // Search right half
            } 
            else {
                high = mid - 1; // Search left half
            }
        }

        return false; // Not found
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bogieIds = {
            "BG101","BG205","BG309","BG412","BG550"
        };

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = binarySearchBogie(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID found using Binary Search.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}