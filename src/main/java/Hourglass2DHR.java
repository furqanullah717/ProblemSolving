
/**
 * Class to calculate a maximum hourglass from a 6x6 2D array
 */
public class Hourglass2DHR {
    /**
     *
     * @param a 2D array to get hourglass values from
     * @return maximum hourglass sum of the 2D array
     */
      int solutions(int[][] a) {
        Integer max = null;
        int rowPoint = 0;
        int columnPoint;
        while (rowPoint < 4) {
            columnPoint = 0;
            while (columnPoint < 4) {
                int R1Val = a[rowPoint][columnPoint] +
                        a[rowPoint][columnPoint + 1] +
                        a[rowPoint][columnPoint + 2];
                int R2Val = a[rowPoint + 1][columnPoint + 1];
                int R3Val = a[rowPoint + 2][columnPoint] +
                        a[rowPoint + 2][columnPoint + 1] +
                        a[rowPoint + 2][columnPoint + 2];
                int re = R1Val + R2Val + R3Val;

                if (max == null)
                    max = re;
                if (re > max)
                    max = re;
                columnPoint++;
            }
            rowPoint++;
        }
        return max;
    }

}
