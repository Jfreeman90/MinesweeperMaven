import com.tsi.minesweeper.difficulty.Difficulty;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DifficultyTest {
    @Test
    public void test_setDifficulty(){
    Difficulty testDiff = new Difficulty();
    testDiff.setDifficulty("EASY");
    assertEquals("EASY", testDiff.getDifficulty(),"Expected to return EASY and didnt.");
    }

    @Test
    public void test_setSize(){
        Difficulty testDiff = new Difficulty();
        testDiff.setDifficulty("HARD");
        testDiff.setSize();
        assertEquals(22, testDiff.getSize(),"Expected to return 22 and didnt.");
    }

    @Test
    public void test_setBombs(){
        Difficulty testDiff = new Difficulty();
        testDiff.setDifficulty("MEDIUM");
        testDiff.setBombs();
        assertEquals(40, testDiff.getBombs(),"Expected to return 40 and didnt.");
    }

    @Test
    public void test_setFlags(){
        Difficulty testDiff = new Difficulty();
        testDiff.setDifficulty("EASY");
        testDiff.setFlags();
        assertEquals(10, testDiff.getFlags(),"Expected to return 10 and didnt.");
    }

}
