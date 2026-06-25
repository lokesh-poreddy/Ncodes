public class Factorial {
    public int factorial(int n) {
        int fac = 1;
        for(int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

 public static void main(String[] args) {
        Factorial factorialObj = new Factorial();
        int n = 5; // Example input
        int result = factorialObj.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
