public class CompressString {
    public int compress(char[] chars) {
        int temp = 0;
        int currIdx = 0;
        char currChar = chars[0];

        for(int i = 0; i < chars.length; i++){
            if( chars[i] != currChar){
                chars[currIdx] = currChar;
                currIdx++;
                if(temp>1){
                    currIdx = addInt(chars,temp,currIdx);
                }
                temp=1;
                currChar = chars[i];
            }else{
                temp++;
            }
        }
        chars[currIdx] = currChar;
        currIdx++;
        if(temp>1){
            currIdx = addInt(chars,temp,currIdx);
        }

        return currIdx;
    }

    public int addInt(char[] chars, int temp, int currIdx){
        int start = currIdx;

        while (temp > 0) {
            chars[currIdx++] = (char)('0' + temp % 10);
            temp /= 10;
        }
        int left = start;
        int right = currIdx - 1;
        while (left < right) {
            char swap = chars[left];
            chars[left] = chars[right];
            chars[right] = swap;
            left++;
            right--;
        }

        return currIdx;
    }


    public static void main(String[] args) {
        CompressString sol = new CompressString();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(sol.compress(chars));
    }

}
