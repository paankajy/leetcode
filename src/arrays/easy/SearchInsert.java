package arrays.easy;

public class SearchInsert {
    int method(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        for(int i=0; i<nums.length-1;i++){
            int med = low + (high-low) /2;
            if(nums[med] == target) return med;

            if(nums[med] > target){
                high = med-1;
            }else{
                low = med+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        SearchInsert si = new SearchInsert();
        int [] nums ={1,3,5,6};
        //int [] nums ={1,0,0,1};
        int target = 7;
        System.out.println(si.method(nums,target));
    }
}
