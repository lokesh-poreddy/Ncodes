public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i;j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        return nums;
    }
public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = {5, 2, 9, 1, 5, 6};
        int[] sortedNums = bubbleSort.bubbleSort(nums);
        for(int num : sortedNums) {
            System.out.print(num + " ");
        }
    }
}


