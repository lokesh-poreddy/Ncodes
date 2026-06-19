public class nonPattern2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if(n == 0 || k == 0) {
            return new int[0];

        }
        int numOfWin = n - k + 1;
        int[] result = new int[numOfWin];
        for(int start = 0; start < numOfWin; ++start) {
            int end = start + k - 1;
            int maxVal = nums[start];
            for (int i = start + 1; i <= end; ++i) {
                if (nums[i] > maxVal) {
                    maxVal = nums[i];
                }
            }
            result[start] = maxVal;
        }
        return result;
    }


    public static void main(String[] args) {
        nonPattern2 solver = new nonPattern2();
        solver.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
    }
}