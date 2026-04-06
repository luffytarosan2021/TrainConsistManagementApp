import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // --- UC1: Initialization ---
        System.out.println("=== Train Consist Management App ===");
        List<String> passengerBogies = new ArrayList<>();
        Set<String> bogieIds = new HashSet<>();

        System.out.println("Initial Bogie Count: " + passengerBogies.size());

        // --- UC2: Dynamic Management (List) ---
        System.out.println("\n--- UC2: Adding Passenger Bogies ---");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("Current Bogies: " + passengerBogies);

        System.out.println("Removing 'AC Chair'...");
        passengerBogies.remove("AC Chair");
        System.out.println("Contains 'Sleeper'? " + passengerBogies.contains("Sleeper"));

        // --- UC3: Uniqueness (Set) ---
        System.out.println("\n--- UC3: Registering Unique IDs ---");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("Attempting to add duplicate ID: BG101...");
        if (!bogieIds.add("BG101")) {
            System.out.println("System Blocked Duplicate: BG101 already exists.");
        }

        System.out.println("Final Unique IDs: " + bogieIds);
        System.out.println("Final Consist List: " + passengerBogies);
    }
}