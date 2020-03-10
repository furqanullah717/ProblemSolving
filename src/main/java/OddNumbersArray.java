import java.util.HashMap;

public class OddNumbersArray {

    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            Integer in = map.get(a);
            if (in == null)
                in = 0;
            if (in == 1) {
                map.remove(a);
                continue;
            }
            map.put(a, ++in);
        }
        return map.keySet().iterator().next();
    }
}
