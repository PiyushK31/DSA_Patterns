public class TwoSumIISortedAray {
    public int[]twoSumIISortedAray(int []nums , int target){
        int sum = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            sum = nums[left] + nums[right];
            if(sum == target){
                return new int[] {left+1 , right+1};
            }
            else if (sum<target) {
                left++;
            }
            else{
                right --;
            }
        }
        return new int[]{left+1 , right+1};
    }
}