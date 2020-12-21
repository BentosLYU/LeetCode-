# 刷题笔记(最热门题目)
--------
## DAY 1

### TwoSum

- Description:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.


Example:
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
```

AnswerCode:
```Java
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
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
```
