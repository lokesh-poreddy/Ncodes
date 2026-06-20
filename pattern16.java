public class pattern16 {
    public void pattern16 (int n) {
        for(int i = 65; i<=65 + n-1;i++) {
            for (int j = 65;j<=i;j++) {
                System.out.print((char)i +"");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        pattern16 ans = new pattern16();
        ans.pattern16(5);
    }
}