// App/src/main/UseCase11TrainConsistMgmnt.java

import java.util.regex.*;

public class UseCase11TrainConsistMgmnt {

    // Validate Train ID
    public static boolean isValidTrainID(String trainID) {
        String pattern = "TRN-\\d{4}";
        return Pattern.matches(pattern, trainID);
    }

    // Validate Cargo Code
    public static boolean isValidCargoCode(String cargoCode) {
        String pattern = "PET-[A-Z]{2}";
        return Pattern.matches(pattern, cargoCode);
    }

    public static void main(String[] args) {

        String trainID = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID: " + trainID +
                " → " + (isValidTrainID(trainID) ? "Valid" : "Invalid"));

        System.out.println("Cargo Code: " + cargoCode +
                " → " + (isValidCargoCode(cargoCode) ? "Valid" : "Invalid"));
    }
}