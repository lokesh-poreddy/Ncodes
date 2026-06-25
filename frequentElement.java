import java.util.HashMap;
import java.util.Map;
public class frequentElement {
    public int mostFrequentElement(int[] nums) {
     HashMap<Integer, Integer> hm = new HashMap<>();
     for (int i = 0; i < nums.length; i++) {
        hm.put(nums[i], hm.getOrDefault(nums[i],0) + 1);
     }
     int max = 0;
     int ans = Integer.MAX_VALUE;

     for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {

        int element = entry.getKey();
        int freq = entry.getValue();

        if (freq > max) {
            max = freq;
            ans = element;
        } else if (freq == max && element < ans) {
            ans = element;
        }
     }
     return ans;
    }
public static void main(String[] args) {
    frequentElement solution = new frequentElement();
    int[] nums = {1, 2, 2, 3, 3, 3, 4};
    int result = solution.mostFrequentElement(nums);
    System.out.println("Most frequent element: " + result);
}
}


