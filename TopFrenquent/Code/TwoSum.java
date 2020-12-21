import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int searchedNum = target - nums[i];
            if (map.containsKey(searchedNum) && map.get(searchedNum) != i) {
                return new int[] {i, map.get(searchedNum)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}