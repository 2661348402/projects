package summer_day06;
/*
 * 找出数组中重复的数字。

在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：
输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3 
 */
//方法一：暴力破解
//class Solution2 {
//    public int findRepeatNumber(int[] nums) {
//    	int n=nums.length;
//    	for(int i=0;i<n-1;i++) {
//    		for(int j=i+1;j<n;j++) {
//    			if(nums[i]==nums[j]) {
//    				return nums[i];
//    			}
//    		}
//    	}
//    	return -1;
//    }
//}
class Solution2 {
    public int findRepeatNumber(int[] nums) {
    	int n=nums.length;
    	int []arr=new int[10000];
    	for(int i:nums) {
    		arr[i]++;
    	}
    	for(int i=0;i<n;i++) {
    		if(arr[i]>=2) {
    			return i;
    		}
    	}
    	return -1;
    }
}
