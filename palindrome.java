public class palindrome {
    public boolean suckerpalindrome (int n) {
        int a = 0 ;
        int num = n;
        while(n != 0) {
            a = (a * 10) + (n % 10);
            n = n / 10;
            if (a == num) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        palindrome sol = new palindrome();
        System.out.println(sol.suckerpalindrome(12321)); 
    }
}
