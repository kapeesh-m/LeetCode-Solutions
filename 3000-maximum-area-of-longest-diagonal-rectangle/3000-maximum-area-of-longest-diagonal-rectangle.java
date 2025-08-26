class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int l = 0, w = 0;
        int maxDiaSq = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int a = dimensions[i][0];
            int b = dimensions[i][1];
            int diaSq = (a * a) + (b * b); // no sqrt

            if (diaSq > maxDiaSq) {
                maxDiaSq = diaSq;
                l = a;
                w = b;
            } else if (diaSq == maxDiaSq && a * b > l * w) {
                // if diagonals are equal, pick rectangle with larger area
                l = a;
                w = b;
            }
        }
        return l * w;
    }
}
