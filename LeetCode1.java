class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        //O(N^2) Not efficient solution!
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    indices[0] = i; indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }
}


//O(N) Solution
public int[] twoSum(int[] nums, int target) {
    //Map<Element at index i ,index>
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
