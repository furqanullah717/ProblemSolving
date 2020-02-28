import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SherlockValidString {

    // Complete the isValid function below.
    static String isValid(String s) {
        int arr[] = new int[26];
        for (char c : s.toCharArray()) {
            int offset = 'a';
            arr[c - offset]++;
        }
        Arrays.sort(arr);
        int index=0;
        while(arr[index]==0)
            index++;
        int min= arr[index];
        int max=arr[25];
        if(min==max)
        return "YES";
        else{
          if(min==arr[24] && Math.abs(arr[24]-max)==1 || 1==min  && max==arr[++index]){
              return "YES";
          }
          return "NO";
        }
    }


    public static void main(String[] args) {
        System.out.println(isValid("ibfdg"));
    }
}
