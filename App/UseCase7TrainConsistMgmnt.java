import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // For printing
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

// Main class
public class UseCase7TrainConsistMgmnt {
    public static void main(String[] args){

        System.out.println("=====================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("=====================================");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        System.out.println(bogies);

        // Sort ascending
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (Ascending):");
        System.out.println(bogies);

        // Sort descending
        bogies.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nAfter Sorting (Descending):");
        System.out.println(bogies);

        System.out.println("\nUC7 operations completed successfully");
    }
}