import java.util.Arrays;

public class SortArray {

    public static void main(String[] args)
    {
        int[] arr = {99,56,4,2,67,85};

        Arrays.sort(arr);

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
