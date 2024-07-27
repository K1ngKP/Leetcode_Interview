class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # map -> {target - nums[i], i}
        # map.contains(nums[i]) return -> i, map.get(nums[i]);
        # else map.put(target - nums[i], i);
        map = {}
        for i in range(0, len(nums)):
            k = target - nums[i]
            if k in map:
                return [i, map[k]]
            map[nums[i]] = i
        return []
