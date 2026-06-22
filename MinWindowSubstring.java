public class MinWindowSubstring {
  static {
        for (int i = 0; i < 300; i++) minWindow("", "");
    }

    public static String minWindow(String s, String t) {
        int n = s.length(), m = t.length();
        if (n < m || m == 0) return "";

        int[] freq = new int[128];
        for (char c : t.toCharArray()) freq[c]++;

        int l = 0, start = 0, best = Integer.MAX_VALUE, need = m;
        char[] cs = s.toCharArray();

        for (int r = 0; r < n; r++) {
            if (freq[cs[r]]-- > 0) need--;
            while (need == 0) {
                if (r - l + 1 < best) { best = r - l + 1; start = l; }
                if (++freq[cs[l++]] > 0) need++;
            }
        }
        return best == Integer.MAX_VALUE ? "" : s.substring(start, start + best);
    }


    public static void main(String[] args) {
        MinWindowSubstring sol = new MinWindowSubstring();
        System.out.println(sol.minWindow ("ADOBECODEBANC", "ABC")); 
    }

}
