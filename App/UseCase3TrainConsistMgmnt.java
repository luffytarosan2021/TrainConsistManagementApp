import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmnt {
    public static void main(String[] args){

        System.out.println("=====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================");

        // Create HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display bogie IDs
        System.out.println("\nBogie IDs in Train:");
        System.out.println(bogieIDs);

        System.out.println("\nTotal Unique Bogies: " + bogieIDs.size());

        System.out.println("\nUC3 operations completed successfully");
    }
}