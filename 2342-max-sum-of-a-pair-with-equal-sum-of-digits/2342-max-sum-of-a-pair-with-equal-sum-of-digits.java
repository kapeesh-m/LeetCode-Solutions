class Solution {
    public int sof(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for (int num : nums) {
            int digitSum = sof(num);
            if (map.containsKey(digitSum)) {
                max = Math.max(max, map.get(digitSum) + num);
                map.put(digitSum, Math.max(map.get(digitSum), num));
            } else {
                map.put(digitSum, num);
            }
        }

        return max;
    }
}