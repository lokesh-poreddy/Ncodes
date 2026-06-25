public class medals {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int maxScore = 0;
        for (int s : score) maxScore = Math.max(maxScore, s);
        int[] rankMap = new int[maxScore + 1];
        for (int i = 0; i < n; i++) rankMap[score[i]] = i + 1;
        String[] result = new String[n];
        int place = 1;
        for (int i = maxScore; i >= 0; i--) {
            if (rankMap[i] != 0) {
                int originalIndex = rankMap[i] - 1;
                if (place == 1) result[originalIndex] = "Gold Medal";
                else if (place == 2) result[originalIndex] = "Silver Medal";
                else if (place == 3) result[originalIndex] = "Bronze Medal";
                else result[originalIndex] = String.valueOf(place);
                place++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        medals obj = new medals();
        String[] ranks = obj.findRelativeRanks(arr);
        for(int i = 0; i < n; i++){
            System.out.print(ranks[i] + " ");
        }
    }
}