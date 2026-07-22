package arrays.easy;


public class RemoveDuplicate {

    int method (int[] nums){
        int j = 0;
        for(int i=0; i<nums.length;i++){
           if(nums[j] != nums[i]){
               nums[++j] = nums[i];

           }


        }


        return ++ j;
    }
    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        //int [] nums = {1,1,2};
        //int [] nums = {0,0,1,1,1,2,2,3,3,4};
        //int [] nums = {0,0,3};
        int [] nums = {-3,-1,0,0,0,3,3};


        System.out.println(removeDuplicate.method(nums));
    }
}
