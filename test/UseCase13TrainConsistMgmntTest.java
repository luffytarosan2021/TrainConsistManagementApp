import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UseCase13TrainConsistMgmntTest {

    List<Bogie> getSampleBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 40));
        return list;
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> result = UseCase13TrainConsistMgmnt.filterWithLoop(getSampleBogies());
        assertEquals(1, result.size()); // only 72 > 60
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> result = UseCase13TrainConsistMgmnt.filterWithStream(getSampleBogies());
        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> loop = UseCase13TrainConsistMgmnt.filterWithLoop(getSampleBogies());
        List<Bogie> stream = UseCase13TrainConsistMgmnt.filterWithStream(getSampleBogies());

        assertEquals(loop.size(), stream.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> list = getSampleBogies();

        long start = System.nanoTime();
        UseCase13TrainConsistMgmnt.filterWithLoop(list);
        long end = System.nanoTime();

        assertTrue((end - start) > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Bogie("B" + i, i % 100));
        }

        List<Bogie> result = UseCase13TrainConsistMgmnt.filterWithStream(list);
        assertNotNull(result);
    }
}