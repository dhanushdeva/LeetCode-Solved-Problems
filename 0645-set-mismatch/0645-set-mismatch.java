class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int freq[] = new int[n+1];
        int rep = -1,no = -1;
        for(int i = 0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i = 1;i<n+1;i++){
            if(freq[i]==2) rep = i;
            if(freq[i]==0) no = i;
            if(no > -1 && rep >-1) break;
        }
        return new int[] {rep,no};
    }
}