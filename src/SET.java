import java.util.ArrayList;
import java.util.Arrays;

public class SET {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(2,4,11,11,6,7,8));
        System.out.println(duplicate(x));
        System.out.println(duplicate2(x));

    }
    public static boolean duplicate(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j <arr.size() ; j++) {
                if(arr.get(i)==arr.get(j) && i!=j){
                    return true;
                }
            }

        }
        return false;
    }
    public static boolean duplicate2(ArrayList<Integer> arr){
        for (int i = 0; i <arr.size() ; i++) {
            for (int j = i+1; j <arr.size() ; j++) {
                if(arr.get(i)==arr.get(j)){
                    return true;
            }

            }
        }
        return false;
    }
}
