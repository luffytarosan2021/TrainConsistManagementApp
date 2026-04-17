import java.util.Scanner;

public class UseCase18TrainConsistMgmnt {

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Found → early termination
            }
        }

        return false; // Not found
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bogieIds = {
            "BG101", "BG205", "BG309", "BG412", "BG550"
        };

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = searchBogie(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID found in the train consist.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}