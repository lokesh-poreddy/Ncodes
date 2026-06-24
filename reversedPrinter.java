class Solution {
    public void reversedprintNumbers(int n) {
        if ( n == 1){
            return;
        }
        reversedprintNumbers(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reversedprintNumbers(5);
    }
}