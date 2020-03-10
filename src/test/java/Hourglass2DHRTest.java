import org.junit.Assert;
import org.junit.Test;

public class Hourglass2DHRTest {
    private Hourglass2DHR classToBeTested = new Hourglass2DHR();

    @Test
    public void test1() {
        int[][] arr = new int[][]{{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        Assert.assertEquals(19, classToBeTested.solutions(arr));
    }

    @Test
    public void test2() {
        int[][] arr1 = new int[][]{{-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}};
        Assert.assertEquals(-6, classToBeTested.solutions(arr1));

    }
}
