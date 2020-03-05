
public class BinaryGapCodility {


    public int solution(int N) {
        boolean isStarted = false;
        int val = 0;
        int max = 0;
        while (N > 0) {
            int a = N % 2;
            N = N / 2;

            if (a == 1 && !isStarted) {
                isStarted = true;
            } else if (a == 1 && isStarted) {
                if (val > max)
                    max = val;
                val = 0;
            } else if (a == 0 && isStarted) {
                val++;
            }
        }
        return max;

    }

//    public static void main(String[] args) {
//       solution(1041);
//    }


}
