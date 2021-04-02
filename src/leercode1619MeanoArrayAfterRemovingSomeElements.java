import java.util.Arrays;

public class leercode1619MeanoArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int min=arr.length/20;
        double res=0;
        for(int i=min;i<(arr.length-min);i++){
            res+=arr[i];
        }
        return res/((double)arr.length*0.9);
    }
}
