import org.junit.Assert;
import org.junit.Test;

public class FrogJumpTest {
    FrogJump classToBeTested = new FrogJump();

    @Test
    public void Test2(){
        Assert.assertEquals(142730189,classToBeTested.solution(3, 999111321, 7));
    }
    @Test
    public void Test1(){
        Assert.assertEquals(142730189,classToBeTested.solution(3, 999111321, 7));
    }
}
