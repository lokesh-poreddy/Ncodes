public class pattern17 {
    public void printAlphabetPyramid(int n) {
        // Outer loop handles the rows (from 'A' up to the n-th letter)
        for (int i = 0; i < n; i++) {
            
            // 1. Print leading spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // 2. Print the ascending characters from 'A' up to the peak
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            
            // 3. Move the character back down by 2 steps to start the descending side
            ch -= 2;
            
            // 4. Print the descending characters back down to 'A'
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
                ch--;
            }
            
            // Move to the next row
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        pattern17 sol = new pattern17();
        sol.printAlphabetPyramid(5); // Pass 5 to get up to 'E'
    }
}
