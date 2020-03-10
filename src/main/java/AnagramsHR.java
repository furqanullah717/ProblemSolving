public class AnagramsHR {

    private static int makeAnagram(String a, String b) {
        int[] charCountString1 = getCharacterCount(a);
        int[] charCountString2 = getCharacterCount(b);
        return getDifference(charCountString1, charCountString2);
    }

    private static int getDifference(int[] charCountString1, int[] charCountString2) {
        int delta = 0;
        for (int i = 0; i < charCountString1.length; i++) {
            delta += Math.abs(charCountString1[i] - charCountString2[i]);
        }
        return delta;
    }

    private static int[] getCharacterCount(String a) {
        int[] resultant = new int[26];
        int offset = 'a';
        for (char c : a.toCharArray()) {
            int index = c - offset;
            resultant[index]++;
        }
        return resultant;
    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("hello", "billion"));
        System.out.println(makeAnagram("billion", "hello"));

    }
}
