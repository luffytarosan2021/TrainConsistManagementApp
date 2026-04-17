import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase16TrainConsistMgmntTest {

    @Test
    void testSort_BasicSorting() {
        UseCase16TrainConsistMgmnt.PassengerBogie[] bogies = {
            new UseCase16TrainConsistMgmnt.PassengerBogie("A", 72),
            new UseCase16TrainConsistMgmnt.PassengerBogie("B", 56),
            new UseCase16TrainConsistMgmnt.PassengerBogie("C", 24),
            new UseCase16TrainConsistMgmnt.PassengerBogie("D", 70),
            new UseCase16TrainConsistMgmnt.PassengerBogie("E", 60)
        };

        UseCase16TrainConsistMgmnt.bubbleSort(bogies);

        int[] expected = {24, 56, 60, 70, 72};

        for (int i = 0; i < bogies.length; i++) {
            assertEquals(expected[i], bogies[i].capacity);
        }
    }

    @Test
    void testSort_AlreadySortedArray() {
        UseCase16TrainConsistMgmnt.PassengerBogie[] bogies = {
            new UseCase16TrainConsistMgmnt.PassengerBogie("A", 24),
            new UseCase16TrainConsistMgmnt.PassengerBogie("B", 56),
            new UseCase16TrainConsistMgmnt.PassengerBogie("C", 60),
            new UseCase16TrainConsistMgmnt.PassengerBogie("D", 70),
            new UseCase16TrainConsistMgmnt.PassengerBogie("E", 72)
        };

        UseCase16TrainConsistMgmnt.bubbleSort(bogies);

        assertEquals(24, bogies[0].capacity);
        assertEquals(72, bogies[4].capacity);
    }

    @Test
    void testSort_DuplicateValues() {
        UseCase16TrainConsistMgmnt.PassengerBogie[] bogies = {
            new UseCase16TrainConsistMgmnt.PassengerBogie("A", 72),
            new UseCase16TrainConsistMgmnt.PassengerBogie("B", 56),
            new UseCase16TrainConsistMgmnt.PassengerBogie("C", 56),
            new UseCase16TrainConsistMgmnt.PassengerBogie("D", 24)
        };

        UseCase16TrainConsistMgmnt.bubbleSort(bogies);

        int[] expected = {24, 56, 56, 72};

        for (int i = 0; i < bogies.length; i++) {
            assertEquals(expected[i], bogies[i].capacity);
        }
    }

    @Test
    void testSort_SingleElementArray() {
        UseCase16TrainConsistMgmnt.PassengerBogie[] bogies = {
            new UseCase16TrainConsistMgmnt.PassengerBogie("A", 50)
        };

        UseCase16TrainConsistMgmnt.bubbleSort(bogies);

        assertEquals(50, bogies[0].capacity);
    }

    @Test
    void testSort_AllEqualValues() {
        UseCase16TrainConsistMgmnt.PassengerBogie[] bogies = {
            new UseCase16TrainConsistMgmnt.PassengerBogie("A", 40),
            new UseCase16TrainConsistMgmnt.PassengerBogie("B", 40),
            new UseCase16TrainConsistMgmnt.PassengerBogie("C", 40)
        };

        UseCase16TrainConsistMgmnt.bubbleSort(bogies);

        for (UseCase16TrainConsistMgmnt.PassengerBogie b : bogies) {
            assertEquals(40, b.capacity);
        }
    }
}