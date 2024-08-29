class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        for (int left = 0, right = 0, prev = 0, n = s.length(); right <= n; right++) {
            if (right == n || s.charAt(left) != s.charAt(right)) {
                int current = right - left;
                count += Math.min(prev, current);
                prev = current;
                left = right;
            }
        }
        return count;
    }
}