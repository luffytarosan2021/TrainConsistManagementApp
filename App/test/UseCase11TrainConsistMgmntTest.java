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
