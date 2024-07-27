class Solution:
    def rotate(self, nums: List[List[int]]) -> None:
        for i in range(0, len(nums)):
            for j in range(i, len(nums)):
                nums[i][j], nums[j][i] = nums[j][i], nums[i][j]
        for i in range(0, len(nums)):
            nums[i].reverse()    