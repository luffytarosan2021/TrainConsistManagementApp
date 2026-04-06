import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 * This class serves as the entry point for the Train Consist Management App.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Display Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Dynamic Initialization of the Train Consist
        // We use the List interface with an ArrayList implementation to store bogies.
        // For now, it is an empty list of Objects, which will later hold specific Bogie types.
        List<Object> trainConsist = new ArrayList<>();

        // 3. Logic to simulate initialization
        System.out.println("Initializing train consist...");

        // 4. Display Initial Consist Summary
        // The size() method confirms the list is currently empty.
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // 5. Continuation message
        System.out.println("System ready. Waiting for bogie assignment...");
    }
}