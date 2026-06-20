public class Pattern21 {
    public void pattern21(int n) {
        for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        if(i==1 || i==n||j==1||j==n){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
     }
    }


    

    public static void main(String[] args) {
        Pattern21 sol = new Pattern21();
        sol.pattern21(5); // Pass 5 to get up to 'E'
    }
}
