public class elements {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int len = columnTitle.length();
        for(int i=0;i<len;i++){
            int val = columnTitle.charAt(i) - 'A'+1;
            
            res = res*26+val;
        }
        return res;
    }

public static void main(String[] args) {
    elements e = new elements();
    System.out.println(e.titleToNumber("AB"));
 }

}



