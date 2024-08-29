class Solution {
    public int value(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}

    public int numberOfArithmeticSlices(int[] nums) {
        // Calculate differences between consecutive elements
        int[] diff = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }

        int ans = 0; // Total count of arithmetic slices
        int i = 1, j = 2; // Pointers to scan the diff array

        while (i != diff.length) {
            int count = 2; // Number of consecutive elements with the same difference
            while (j < diff.length && diff[i] == diff[j]) {
                count++;
                j++;
            }

            if (count >= 3) {
                // Found an arithmetic slice, count the number of slices within it
                ans += value(count - 2);
// WHY count - 2 MAKE a table to see the pattern for set of 3,4,5,6 
//numbers in sequence and hence get up to it and if any problem comment
            }

            i = j;
            j = i + 1;
        }

        return ans;
    }
}