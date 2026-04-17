import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UseCase9TrainConsistMgmntTest {

    List<Bogie> getSampleBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 40));
        return list;
    }

    @Test
    void testGrouping_BogiesGroupedByType() {
        Map<String, List<Bogie>> result =
                UseCase9TrainConsistMgmnt.groupBogies(getSampleBogies());

        assertTrue(result.containsKey("Sleeper"));
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        Map<String, List<Bogie>> result =
                UseCase9TrainConsistMgmnt.groupBogies(getSampleBogies());

        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_EmptyBogieList() {
        Map<String, List<Bogie>> result =
                UseCase9TrainConsistMgmnt.groupBogies(new ArrayList<>());

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        Map<String, List<Bogie>> result =
                UseCase9TrainConsistMgmnt.groupBogies(getSampleBogies());

        assertEquals(2, result.get("Sleeper").size());
        assertEquals(1, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        UseCase9TrainConsistMgmnt.groupBogies(original);

        assertEquals(4, original.size());
    }
}