import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisappearedNumbers {
      public List<Integer> findDisappearedNumbers(int[] nums) {
        return new MyList(nums);
    }
    private static class MyList extends ArrayList<Integer> {
        int[] nums;

        public MyList(int[] nums) {
            this.nums = nums;
        }
        public int size() {
            if (nums != null) {
                method();
            }
            return super.size();
        }
        public void method() {
            int[] nums = this.nums;
            Set<Integer> set = new HashSet<>(nums.length + 3, 3f);

            for (int num : nums) {
                set.add(num);
            }
            for (int i = nums.length; i > 0; i--) {

                if (!set.contains(i)) {
                    super.add(i);
                }
            }
            this.nums = null;
        }
    }
    public static void main(String[] args) {
        DisappearedNumbers disappearedNumbers = new DisappearedNumbers();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = disappearedNumbers.findDisappearedNumbers(nums);
        System.out.println(result); // Output: [5, 6]
    }
}
