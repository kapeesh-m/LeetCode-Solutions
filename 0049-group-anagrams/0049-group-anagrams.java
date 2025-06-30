class Solution {
    public static boolean isanagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] ch=new int[26];
        for(int i=0;i<s1.length();i++){
            ch[s1.charAt(i)-'a']++;
            ch[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ch[i]!=0){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li=new ArrayList<>();
        boolean[] visited=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(!visited[i]){
                List<String> lis=new ArrayList<>();
                lis.add(strs[i]);
                visited[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(!visited[j] && isanagram(strs[i],strs[j])){
                    lis.add(strs[j]);
                    visited[j]=true;
                }
            }
            li.add(lis);
            }
        }
        return li;
    }
}