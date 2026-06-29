public class reversed {
    public void reverse(int[] arr, int n) {
        int l = 0;
        int r = n -1;
        while(l < r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        l++;
        r--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        reversed obj = new reversed();
        obj.reverse(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
//siker
