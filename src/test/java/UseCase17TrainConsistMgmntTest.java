package Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase17TrainConsistMgmntTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] bogies = {"Sleeper","AC Chair","First Class","General","Luxury"};

        UseCase17TrainConsistMgmnt.sortBogieNames(bogies);

        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};

        assertArrayEquals(expected, bogies);
    }

    @Test
    void testSort_UnsortedInput() {
        String[] bogies = {"Luxury","General","Sleeper","AC Chair"};

        UseCase17TrainConsistMgmnt.sortBogieNames(bogies);

        String[] expected = {"AC Chair","General","Luxury","Sleeper"};

        assertArrayEquals(expected, bogies);
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] bogies = {"AC Chair","First Class","General"};

        UseCase17TrainConsistMgmnt.sortBogieNames(bogies);

        String[] expected = {"AC Chair","First Class","General"};

        assertArrayEquals(expected, bogies);
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] bogies = {"Sleeper","AC Chair","Sleeper","General"};

        UseCase17TrainConsistMgmnt.sortBogieNames(bogies);

        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};

        assertArrayEquals(expected, bogies);
    }

    @Test
    void testSort_SingleElementArray() {
        String[] bogies = {"Sleeper"};

        UseCase17TrainConsistMgmnt.sortBogieNames(bogies);

        String[] expected = {"Sleeper"};

        assertArrayEquals(expected, bogies);
    }
}