import org.junit.Assert;
import org.junit.Test;

public class OddNumbersArrayTest {
    OddNumbersArray classToBeTested = new OddNumbersArray();


    @Test
    public void Test1() {
        Assert.assertEquals(7, classToBeTested.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
}
