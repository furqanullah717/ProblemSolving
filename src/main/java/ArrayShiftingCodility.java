
public class ArrayShiftingCodility {
    public int[] solution(int[] A, int K) {
       int ar[]=A.clone();
        for (int i=0;i<K;i++){
            for(int k=0;k<A.length;k++){
                if(k==A.length-1){
                    ar[0]=A[A.length-1];
                continue;
                }
                ar[k+1]=A[k];
            }
            A=ar.clone();
        }
        return ar;
    }

}
