public class UseCase16TrainConsistMgmnt {

    // Passenger Bogie Class
    static class PassengerBogie {
        String type;
        int capacity;

        public PassengerBogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    // Bubble Sort Method
    public static void bubbleSort(PassengerBogie[] bogies) {
        int n = bogies.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (bogies[j].capacity > bogies[j + 1].capacity) {

                    // Swap bogies
                    PassengerBogie temp = bogies[j];
                    bogies[j] = bogies[j + 1];
                    bogies[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break; // optimization
        }
    }

    // Display Method
    public static void display(PassengerBogie[] bogies) {
        System.out.println("Sorted Passenger Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b.type + " (" + b.capacity + ")");
        }
    }

    // Main Method
    public static void main(String[] args) {

        PassengerBogie[] bogies = {
            new PassengerBogie("Sleeper", 72),
            new PassengerBogie("AC Chair", 60),
            new PassengerBogie("First Class", 24),
            new PassengerBogie("Sleeper", 70),
            new PassengerBogie("AC Chair", 56)
        };

        bubbleSort(bogies);
        display(bogies);
    }
}