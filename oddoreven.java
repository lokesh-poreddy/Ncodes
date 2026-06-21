public class oddoreven {
public void evenorodd(int n) {
        if(n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
}

    public static void main(String[] args) {
        oddoreven sol = new oddoreven();
        sol.evenorodd(12345); 
    }
}
