public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                int j=i+1;
                while(j<nums.length && nums[j]==1){
                    j++;
                }
                res = Math.max(j-i,res);
                i=j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MaxConsecutive maxConsecutive = new MaxConsecutive();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = maxConsecutive.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + result);
    }
}