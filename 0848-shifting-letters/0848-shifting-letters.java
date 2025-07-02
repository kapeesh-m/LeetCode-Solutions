class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] ch = s.toCharArray();
        int n = shifts.length;
        int totalShift = 0;

        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            ch[i] = (char)((ch[i] - 'a' + totalShift) % 26 + 'a');
        }

        return new String(ch);
    }
}
