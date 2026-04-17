import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmnt {
    public static void main(String[] args){

        System.out.println("=====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=====================================");

        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Removing AC Chair
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Checking existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nContains Sleeper? : " + exists);

        // Final state
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully");
    }
}