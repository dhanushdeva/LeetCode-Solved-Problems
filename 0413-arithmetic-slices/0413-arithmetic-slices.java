class Solution {
    public int value(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}

    public int numberOfArithmeticSlices(int[] nums) {
        int[] diff = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }

        int ans = 0; 
        int i = 1, j = 2; 

        while (i != diff.length) {
            int count = 2; 
            while (j < diff.length && diff[i] == diff[j]) {
                count++;
                j++;
            }

            if (count >= 3) {
                ans += value(count - 2);

            }

            i = j;
            j = i + 1;
        }

        return ans;
    }
}