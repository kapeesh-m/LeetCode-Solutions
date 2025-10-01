class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int cur = numBottles;
        int tot = numBottles;

        while (cur >= numExchange) {
            int newBottles = cur / numExchange;   
            int remainder = cur % numExchange;   
            tot += newBottles;                  
            cur = newBottles + remainder;        
        }

        return tot;
    }
}
