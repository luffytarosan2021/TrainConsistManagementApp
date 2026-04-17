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