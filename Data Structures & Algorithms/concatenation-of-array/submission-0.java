class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int ans[]=new int[2*n];
       // ans=new int[2n];
        for(int i=0;i<nums.length;i++){
               //ans[i]==ans[i+n];
               ans[i]=nums[i];
               ans[i+n]=ans[i];

        }

        return ans;


    }
}