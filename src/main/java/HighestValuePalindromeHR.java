
public class HighestValuePalindromeHR {
    // Complete the highestValuePalindrome function below.
    static String highestValuePalindrome(String s, int n, int k) {
        StringBuilder possiblities1=new StringBuilder(s);
        StringBuilder possiblities2=new StringBuilder(s);
   int changesPos1=0;
   int changesPos2=0;
        for (int i=0;i<n/2;i++){
            //possiblities 1
            if(changesPos1<k)
            if(possiblities1.charAt(i)!=possiblities1.charAt(n-1-i)){
                if(possiblities1.charAt(i)>possiblities1.charAt(n-1-i))
                    possiblities1.setCharAt(n-1-i,possiblities1.charAt(i));
                else
                    possiblities1.setCharAt(i,possiblities1.charAt(n-1-i));
                changesPos1++;
            }
            //possibilities 2
            if(changesPos2<k)
            if(possiblities2.charAt(i)!=possiblities2.charAt(n-1-i)){
                if(possiblities2.charAt(i)>possiblities2.charAt(n-1-i))
                    possiblities2.setCharAt(n-1-i,possiblities2.charAt(i));
                else
                    possiblities2.setCharAt(i,possiblities2.charAt(n-1-i));
            changesPos2++;
            }
        }

        return Long.parseLong(possiblities1.toString())>Long.parseLong(possiblities2.toString())?possiblities1.toString():possiblities2.toString();
    }

    public static void main(String[] args) {
        System.out.println(highestValuePalindrome("93239", 5, 1));
        System.out.println(highestValuePalindrome("932239", 6, 2));
        System.out.println(highestValuePalindrome("092282", 6, 3));
    }
}
