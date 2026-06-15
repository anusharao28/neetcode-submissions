class Solution {
    public boolean isAnagram(String s, String t) {

        //sort
        /*
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
        */


        //ascii value
      /*  int m=s.length();
        int n=t.length();
        if(m!=n){
            return false;
        }
        int[] count=new int[26];
        for(int i=0;i<m;i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            count[t.charAt(i)-'a']--;
        }
        for(int j:count){
            if(j!=0){
                return false;
            }
        }
        return true;
        */

        //hashmap
        int m=s.length();
        int n=t.length();
        if(m!=n){
            return false;
        }

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)|| map.get(ch)==0){
                return false;
            }
                map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}
