class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # map -> {target - nums[i], i}
        # map.contains(nums[i]) return -> i, map.get(nums[i]);
        # else map.put(target - nums[i], i);
        map = {}
        for i,j in enumerate(nums):
            k = target - j
            if k in map:
                return [i, map[k]]
            map[j] = i
        
        return []

