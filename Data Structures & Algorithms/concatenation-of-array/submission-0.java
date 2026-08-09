class Solution {
    public int[] getConcatenation(int[] arr) {
        int n=arr.length;
        int[] ans=new int[2*n];
        int left=0;
        int right=0;
        while(left<n){
            ans[right]=arr[left];
            ans[right+n]=arr[left];
            left++;
            right++;
        }
        return ans;
    }
}