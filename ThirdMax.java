public class ThirdMax {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        int n = nums.length;
        if(n==1){
            return nums[0];
        }else if(n <= 2){
            if(nums[0] < nums[1]){
                return nums[1];
            }else{
                return nums[0];
            }
        }else if(n > 2){
            for(int num : nums){
                if (num > largest) {
                    third = sec;
                    sec = largest;
                    largest = num;
                } else if (num > sec && num != largest) {
                    third = sec;
                    sec = num;
                } else if (num > third && num != sec && num != largest) {
                    third = num;
                }
            }
        }
        if(third == Long.MIN_VALUE){
            return (int)largest;
        }
        return (int)third;
    }

    public static void main(String[] args) {
        ThirdMax thirdMax = new ThirdMax();
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax.thirdMax(nums)); // Output: 1
    }

}