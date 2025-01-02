class Solution {
    public int maxScore(String s) {
        int n = s.length(), maxScore = 0;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + (s.charAt(i) == '1' ? 1 : 0);
        for (int i = 1; i < n; i++) maxScore = Math.max(maxScore, i - prefix[i] + prefix[n] - prefix[i]);
        return maxScore;
    }
}
