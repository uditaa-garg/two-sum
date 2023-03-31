class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
       //  int n = mums.length();
         int [] b = new int[2];
       //System.out.println("enter the target:");
       // t = sc.nextInt();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
               
                sum = nums[i]+nums[j];

                if(sum==target){
                  b[0]=i;
                  b[1]=j;
                  break;
                }
            }
        }
        return b;
    }
}
