function binarySearch(nums: number[], target : number, start: number, end:number) {
    const middleIndex = Math.floor( (start + end) / 2);

    if ( (end - start) <= 1  && nums[middleIndex] != target) {
        return -1;
    }
    
    if (nums[middleIndex] == target)  {
        return middleIndex
    } else if (target < nums[middleIndex]) {
        return binarySearch(nums, target, start, middleIndex)
    } else if (target > nums[middleIndex]) {
        return binarySearch(nums, target, middleIndex, end)
    }
    return -1
}

function findPivotIndex(nums: number[], first: number, start: number, end: number) : undefined | number {
    if (nums.length == 1) {
        return start
    }
    const middleIndex = Math.floor((start + end)/2);
    if (end - start <= 1) {
        return undefined;
    }
    
    const middleNumber = nums[middleIndex];
    const numberToLeft = nums[middleIndex - 1]
    if (numberToLeft > middleNumber){
        return middleIndex;
    } else if (middleNumber > first){
        // go to right
        return findPivotIndex(nums, first, middleIndex, end)
    } else {
        // go to left
        return findPivotIndex(nums, first, start, middleIndex)
    }
}

function search(nums: number[], target: number): number {
    const pivot = findPivotIndex(nums, nums[0], 0, nums.length)
    if (pivot === undefined ){
        return binarySearch(nums, target, 0, nums.length)
    }
    const side1 = binarySearch(nums, target, 0, pivot)
    const side2 = binarySearch(nums, target, pivot, nums.length)
    return Math.max(side1, side2)
};