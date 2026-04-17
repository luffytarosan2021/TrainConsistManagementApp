import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15TrainConsistMgmntTest {

    @Test
    void testCargo_SafeAssignment() {
        UseCase15TrainConsistMgmnt.GoodsBogie b =
                new UseCase15TrainConsistMgmnt.GoodsBogie("Cylindrical");

        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        UseCase15TrainConsistMgmnt.GoodsBogie b =
                new UseCase15TrainConsistMgmnt.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");

        // cargo should NOT be assigned
        assertNull(b.cargo);
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        UseCase15TrainConsistMgmnt.GoodsBogie b =
                new UseCase15TrainConsistMgmnt.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum"); // error handled

        // next operation still works
        b.assignCargo("Coal");

        assertEquals("Coal", b.cargo);
    }
}