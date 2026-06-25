public class counts {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        char[] answer = new char[2 << n / 2];
        char[] next = new char[2 << n / 2];
        char[] temp;

        next[0] = '1';
        int count = 1;
        while (--n > 0) {
            count = nextStep(answer, next);
            temp = answer;
            answer = next;
            next = temp;
        }
        return new String(next, 0, count);
    }

    private int nextStep(char[] answer, char[] temp) {
        int n = temp.length;

        char countTemp;
        char charTemp;
        int i = 0, j = 0;
        while (i < n && (charTemp = temp[i++]) != 0) {
            countTemp = '1';
            while (i < n && charTemp == temp[i]) {
                countTemp++;
                i++;
            }
            answer[j++] = countTemp;
            answer[j++] = charTemp;
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        counts obj = new counts();
        String result = obj.countAndSay(n);
        System.out.println(result);
    }
}