import java.util.LinkedHashSet;

public class UseCase5TrainConsistMgmnt {
    public static void main(String[] args){

        System.out.println("=====================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=====================================");

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate
        train.add("Sleeper"); // will be ignored

        // Display formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        System.out.println("\nTotal Unique Bogies: " + train.size());

        System.out.println("\nUC5 operations completed successfully");
    }
}