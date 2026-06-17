class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //brute force
        /*for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
        */

        //using binary search
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int complement=target-numbers[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i+1};
            }
            map.put(numbers[i],i+1);
        }
        return new int[]{};
    }
    
}
