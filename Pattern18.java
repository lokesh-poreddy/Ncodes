public class Pattern18 {
    public void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + n - 1 - i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++; 
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        Pattern18 sol = new Pattern18();
        sol.pattern18(5); // Pass 5 to get up to 'E'
    }
}
