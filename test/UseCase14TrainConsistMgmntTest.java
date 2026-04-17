import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14TrainConsistMgmntTest {

    @Test
    void testException_ValidCapacityCreation() throws InvalidCapacityException {
        PassengerBogie b = new PassengerBogie("Sleeper", 72);
        assertEquals(72, b.capacity);
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        Exception e = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("Sleeper", -10);
        });

        assertEquals("Capacity must be greater than zero", e.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("Sleeper", 0);
        });
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        PassengerBogie b = new PassengerBogie("AC Chair", 60);

        assertEquals("AC Chair", b.type);
        assertEquals(60, b.capacity);
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws InvalidCapacityException {
        PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
        PassengerBogie b2 = new PassengerBogie("AC Chair", 60);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}