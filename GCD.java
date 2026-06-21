public class GCD {
    public void GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD: " + a);
    }

    public static void main(String[] args) {
        GCD sol = new GCD();
        sol.GCD(48, 18); 
    }
}
