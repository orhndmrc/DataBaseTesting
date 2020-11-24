import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class maximumValue {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(2,4,11,13,6,7,8));
        System.out.println(max2(x));
    }
    //find max value
    public static int max(ArrayList<Integer> arr){
        int min = 15;
        for (int i = 0; i <arr.size() ; i++) {
            if(arr.get(i)<min)  {
                min=arr.get(i);
            }
        }

        return min;
    }
    //find max value
    public static int max2(ArrayList<Integer> arr){
        int last=0;
        Collections.sort(arr);
        last=arr.get(arr.size()/2); //find second max
        return last;
    }

}
