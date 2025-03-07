import java.util.*;

class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primesList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                primesList.add(i);
            }
        }
        int[] closestPrimes = {-1, -1};
        if (primesList.size() < 2) return closestPrimes;
        int minGap = Integer.MAX_VALUE;
        for (int i = 1; i < primesList.size(); i++) {
            int gap = primesList.get(i) - primesList.get(i - 1);
            if (gap < minGap) {
                minGap = gap;
                closestPrimes[0] = primesList.get(i - 1);
                closestPrimes[1] = primesList.get(i);
            }
        }
        return closestPrimes;
    }
}
