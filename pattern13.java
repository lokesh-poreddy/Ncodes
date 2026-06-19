public class pattern13 {
    public void pattern13 (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <=i;j++) {
                sum += 1;
                System.out.print(sum +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern13 solver = new pattern13();
        solver.pattern13(4); 
    }
}