package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase19TrainConsistMgmntTest {

    @Test
    void testBinarySearch_BogieFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(UseCase19TrainConsistMgmnt.binarySearchBogie(bogies, "BG309"));
    }

    @Test
    void testBinarySearch_BogieNotFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(UseCase19TrainConsistMgmnt.binarySearchBogie(bogies, "BG999"));
    }

    @Test
    void testBinarySearch_FirstElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(UseCase19TrainConsistMgmnt.binarySearchBogie(bogies, "BG101"));
    }

    @Test
    void testBinarySearch_LastElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(UseCase19TrainConsistMgmnt.binarySearchBogie(bogies, "BG550"));
    }

    @Test
    void testBinarySearch_SingleElementArray() {
        String[] bogies = {"BG101"};

        assertTrue(UseCase19TrainConsistMgmnt.binarySearchBogie(bogies, "BG101"));
    }

    @Test
    void testBinarySearch_EmptyArray() {
        String[] bogies = {};

        assertFalse(UseCase19TrainConsistMgmnt.binarySearchBogie(bogies, "BG101"));
    }

    @Test
    void testBinarySearch_UnsortedInputHandled() {
        String[] bogies = {"BG309","BG101","BG550","BG205","BG412"};

        assertTrue(UseCase19TrainConsistMgmnt.binarySearchBogie(bogies, "BG205"));
    }
}