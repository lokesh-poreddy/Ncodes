public class nonpattern {
    public int trap(int[] height) {
        int n = height.length;
        int totalWater = 0;
        int lMax = 0;
        int rMax = 0;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            lMax = Math.max(lMax, height[start]);
            rMax = Math.max(rMax, height[end]);

            if (lMax < rMax){
                totalWater += lMax - height[start];
                start++;
            } else {
                totalWater += rMax - height[end];
                end--;
            }
        }
        return totalWater;
    }


    public static void main(String[] args) {
        nonpattern solver = new nonpattern();
        solver.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}); 
    }
}