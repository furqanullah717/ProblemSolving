public class Recursion {
    static int getFactorial(int val) {
        if (val == 0)
            return 1;
        return val * getFactorial((val - 1));
    }


    static int fibonacciSeries(int val) {
        if (val < 1)
            return -1;
        if (val == 1 || val == 2)
            return val - 1;
        else
            return fibonacciSeries(val - 1) + fibonacciSeries(val - 2);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(10));
        System.out.println(fibonacciSeries(3));
    }
}
