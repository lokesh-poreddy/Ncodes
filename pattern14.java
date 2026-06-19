public class pattern14 {
    public void pattern14 (int n) {
        for(int i = 65; i <=65+ n; i++) {
            for(int j = 65; j< i; j++) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern14 solver = new pattern14();
        solver.pattern14 (4); 
    }
}