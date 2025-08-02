class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0; int a[]=new int[2];
        int l=0,r=nums.length-1;
        while(l<r){
            sum=nums[l]+nums[r];
            if(sum==target) {a[0]=l;a[1]=r;return a;}
            if(sum>target)
            r--;
            else if(sum<target)
            l++;
        }
        return a;
    }
}
