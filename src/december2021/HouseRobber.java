package december2021;

public class HouseRobber {
    public int rob(int[] nums) {
        int evenSum=0;
        int oddSum=0;
        for (int i=0;i<nums.length;i++){
            if(i%2==0){
                evenSum= evenSum+nums[i];
                evenSum = evenSum > oddSum ? evenSum: oddSum;
            }else{
                oddSum+=nums[i];
                oddSum = evenSum > oddSum ? evenSum: oddSum;
            }
        }
        return  evenSum > oddSum ? evenSum: oddSum;
    }

    public static void main(String[] args) {
        HouseRobber h = new HouseRobber();
        int [] a = {2,7,9,3,1};
        int [] b ={1};
        int [] c = {1,3,1,3,100};
        System.out.println(h.rob(c));
    }
}
