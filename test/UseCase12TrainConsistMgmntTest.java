import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UseCase12TrainConsistMgmntTest {

    @Test
    void testSafety_AllBogiesValid() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));

        assertTrue(UseCase12TrainConsistMgmnt.isTrainSafe(list));
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Coal"));

        assertFalse(UseCase12TrainConsistMgmnt.isTrainSafe(list));
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Open", "Coal"));
        list.add(new GoodsBogie("Box", "Grain"));

        assertTrue(UseCase12TrainConsistMgmnt.isTrainSafe(list));
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Cylindrical", "Coal")); // invalid

        assertFalse(UseCase12TrainConsistMgmnt.isTrainSafe(list));
    }

    @Test
    void testSafety_EmptyBogieList() {
        assertTrue(UseCase12TrainConsistMgmnt.isTrainSafe(new ArrayList<>()));
    }
}