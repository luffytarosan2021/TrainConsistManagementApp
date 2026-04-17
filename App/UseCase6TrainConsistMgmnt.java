import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmnt {
    public static void main(String[] args){

        System.out.println("=====================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("=====================================");

        // Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display all bogies with capacity
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        System.out.println("\nUC6 operations completed successfully");
    }
}