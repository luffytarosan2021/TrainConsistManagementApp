import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UseCase8TrainConsistMgmntTest {

    List<Bogie> getSampleBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 60));
        list.add(new Bogie("First Class", 40));
        return list;
    }

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result = UseCase8TrainConsistMgmnt.filterBogies(getSampleBogies(), 60);

        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).name);
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result = UseCase8TrainConsistMgmnt.filterBogies(getSampleBogies(), 60);

        // AC Chair = 60 should NOT be included
        assertTrue(result.stream().noneMatch(b -> b.capacity == 60));
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> result = UseCase8TrainConsistMgmnt.filterBogies(getSampleBogies(), 100);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> result = UseCase8TrainConsistMgmnt.filterBogies(getSampleBogies(), 30);

        assertEquals(3, result.size());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        UseCase8TrainConsistMgmnt.filterBogies(original, 60);

        // original list should remain same
        assertEquals(3, original.size());
    }
}