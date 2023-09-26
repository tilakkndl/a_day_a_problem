package day5;

public class richestWealth {
    public static void main(String[] args) {
        int[][] nums = {{1,3,3,5},{1,1,1},{1,3}, {1,8}};
        System.out.println(maximumWealth(nums));
        
    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth=-1;
        int maxCustomer=-1;
        for(int[] acc: accounts){
            int accountSum=0;
            for(int i = 0;i<acc.length;i++){
                accountSum+=acc[i];
                  if(maxWealth<accountSum){
                maxWealth=accountSum;
                maxCustomer=i+1;
                
            }
            }
          
        }
        System.out.println(maxCustomer);
        return maxWealth;
        
    }
}
