class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            Integer[] lst = new Integer[i+1];
            Arrays.fill(lst,1);
            answer.add(Arrays.asList(lst));
        }
        for(int i=2;i<numRows;i++) {
            for(int j=1; j<answer.get(i).size()-1;j++) {
                answer.get(i).set(j, answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j));
            }
        }
        return answer;
    }
}