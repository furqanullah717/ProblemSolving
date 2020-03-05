import org.junit.Assert;
import org.junit.Test;


public class BinaryGapCodilityTest {
    BinaryGapCodility classToBeTested = new BinaryGapCodility();


    @Test
    public void Test1() {
        Assert.assertEquals(5, classToBeTested.solution(1041));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(0, classToBeTested.solution(32));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(0, classToBeTested.solution(15));
    }
    @Test
    public void Test4() {
        Assert.assertEquals(28, classToBeTested.solution(1610612737));
    }
}
