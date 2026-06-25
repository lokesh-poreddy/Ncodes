public class fibonacci {
    public int fib(int n) {
        //your code goes here
        if (n <= 1) {
            return n;
        }
        int l = fib(n -1);
        int sl = fib(n -2);
        return l + sl;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        fibonacci obj = new fibonacci();
        int result = obj.fib(n);
        System.out.println(result);
    }
}