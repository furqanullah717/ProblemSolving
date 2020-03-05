public class FrogJump {
    public int solution(int X, int Y, int D) {
        int val = Y - X;
        double r = val / (double) D;
        return (int) Math.ceil(r);
    }
}
