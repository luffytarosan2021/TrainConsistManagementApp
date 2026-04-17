import java.util.Arrays;

public class UseCase17TrainConsistMgmnt {

    // Method to sort bogie names
    public static void sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames); // Built-in sorting
    }

    // Display Method
    public static void display(String[] bogieNames) {
        System.out.println("Sorted Bogie Names: " + Arrays.toString(bogieNames));
    }

    // Main Method
    public static void main(String[] args) {

        String[] bogieNames = {
            "Sleeper",
            "AC Chair",
            "First Class",
            "General",
            "Luxury"
        };

        sortBogieNames(bogieNames);
        display(bogieNames);
    }
}