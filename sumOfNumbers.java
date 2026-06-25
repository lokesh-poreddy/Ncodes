public class sumOfNumbers {
    public int NnumbersSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum; 
    }

    public static void main(String[] args) {
        sumOfNumbers sumObj = new sumOfNumbers();
        int result = sumObj.NnumbersSum(5);
        System.out.println("Sum of first 5 natural numbers: " + result);
    }
}