import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayShiftingCodilityTest {
    ArrayShiftingCodility classToBeTested = new ArrayShiftingCodility();


    @Test
    public void Test1() {
        Assert.assertArrayEquals(new int[]{9,7,6,3,8}, classToBeTested.solution(new int[]{3, 8, 9, 7, 6}, 3));
    }

    @Test
    public void Test2() {
        Assert.assertArrayEquals(new int[]{3}, classToBeTested.solution(new int[]{3}, 0));
    }
}
