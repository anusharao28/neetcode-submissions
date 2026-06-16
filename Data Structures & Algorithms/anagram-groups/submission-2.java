class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map=new HashMap<>();
        for(String str: strs){
            int[] ch=new int[26];
            for(char c: str.toCharArray()){
                ch[c-'a']++;
            }
            String key=Arrays.toString(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
