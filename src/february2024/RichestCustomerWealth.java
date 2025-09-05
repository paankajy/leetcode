package february2024;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int result =0;
        for(int i=0;i<accounts.length;i++){
            int localVar = 0;
            for(int j=0;j<accounts[i].length;j++){
                localVar += accounts[i][j];
            }
            if(localVar>result){
                result = localVar;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        int [] [] array1 = {
                {1,2,3},
                {3,2,1}
        };
        array1[0][0] = 1;
        System.out.println(richestCustomerWealth.maximumWealth(array1));
    }
}
