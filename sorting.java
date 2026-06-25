import java.util.Arrays;
public class sorting {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

public static void main(String[] args) {
    sorting s = new sorting();
    int[] nums = {5, 2, 8, 1, 9};
    int[] sorted = s.sortArray(nums);
    System.out.println(Arrays.toString(sorted));
 }

}



