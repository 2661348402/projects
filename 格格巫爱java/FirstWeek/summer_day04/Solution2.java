package summer_day04;
/*
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
进阶：

    尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
    你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？

示例 1:

输入: nums = [1,2,3,4,5,6,7], k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]
*/
class Solution2 {
    public void rotate(int[] nums, int k) {
    	int n=nums.length;
    	int m=k%n;
    	reverse(nums,0,n-1);
    	reverse(nums,0,m-1);
    	reverse(nums,m,n-1);
    	
    }
     int[] reverse(int []nums,int i,int j){
    	while(i<j) {
    		int temp=nums[i];
    		nums[i]=nums[j];
    		nums[j]=temp;
    		i++;
    		j--;
    	}
    	return nums;
    }
}
