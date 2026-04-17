public class UseCase14TrainConsistMgmnt {

    // Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Passenger Bogie Class
    static class PassengerBogie {
        String type;
        int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }

    // Main Method
    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Bogie created: " + b1.type + " (" + b1.capacity + ")");

            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);
            System.out.println("Bogie created: " + b2.type + " (" + b2.capacity + ")");

            // Invalid case
            PassengerBogie b3 = new PassengerBogie("First Class", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}