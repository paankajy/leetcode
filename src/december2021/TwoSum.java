package december2021;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int result [] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int [] {nums[i],nums[j]};
                }
            }
        }
        return new int [0];
    }
}
