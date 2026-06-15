class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> complement = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int reqNum =  target-nums[i];
                if (complement.containsKey(reqNum)) {
                    int[] arr={complement.get(reqNum), i};
                    return arr;
                }
                complement.put(nums[i], i);
            }
            return null;
        
    }
}
