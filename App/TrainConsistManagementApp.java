import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // --- UC1: Initialization ---
        System.out.println("=== Train Consist Management App ===");

        // --- UC2: Dynamic Management of Passenger Bogies ---

        // 1. Create an ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add bogies (Create/Insertion)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Display the list (Read)
        System.out.println("\n--- Current Train Consist ---");
        System.out.println("Bogies added: " + passengerBogies);
        System.out.println("Total count: " + passengerBogies.size());

        // 4. Remove a bogie (Delete)
        System.out.println("\nRemoving 'AC Chair' from the consist...");
        passengerBogies.remove("AC Chair");

        // 5. Check existence (Search)
        System.out.println("Checking status of 'Sleeper' bogie...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Status: Sleeper bogie is present and verified.");
        } else {
            System.out.println("Status: Sleeper bogie not found.");
        }

        // 6. Print final list state
        System.out.println("\n--- Final Train Consist Summary ---");
        System.out.println("Current Bogies: " + passengerBogies);
        System.out.println("Final Bogie Count: " + passengerBogies.size());
    }
}