import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UseCase10TrainConsistMgmntTest {

    List<Bogie> getSampleBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 40));
        return list;
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        int total = UseCase10TrainConsistMgmnt.getTotalCapacity(getSampleBogies());
        assertEquals(168, total); // 72 + 56 + 40
    }// App/src/test/UseCase11TrainConsistMgmntTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistMgmntTest {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(UseCase11TrainConsistMgmnt.isValidTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(UseCase11TrainConsistMgmnt.isValidTrainID("TRAIN12"));
        assertFalse(UseCase11TrainConsistMgmnt.isValidTrainID("TRN12A"));
        assertFalse(UseCase11TrainConsistMgmnt.isValidTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(UseCase11TrainConsistMgmnt.isValidCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(UseCase11TrainConsistMgmnt.isValidCargoCode("PET-ab"));
        assertFalse(UseCase11TrainConsistMgmnt.isValidCargoCode("PET123"));
        assertFalse(UseCase11TrainConsistMgmnt.isValidCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(UseCase11TrainConsistMgmnt.isValidTrainID("TRN-123"));
        assertFalse(UseCase11TrainConsistMgmnt.isValidTrainID("TRN-12345"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(UseCase11TrainConsistMgmnt.isValidTrainID(""));
        assertFalse(UseCase11TrainConsistMgmnt.isValidCargoCode(""));
    }
}

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));

        int total = UseCase10TrainConsistMgmnt.getTotalCapacity(list);
        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        int total = UseCase10TrainConsistMgmnt.getTotalCapacity(new ArrayList<>());
        assertEquals(0, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        int total = UseCase10TrainConsistMgmnt.getTotalCapacity(getSampleBogies());
        assertTrue(total == 168);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        UseCase10TrainConsistMgmnt.getTotalCapacity(original);

        assertEquals(3, original.size());
    }
}