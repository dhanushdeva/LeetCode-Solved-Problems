class Solution {
    public String intToRoman(int num) {
        String s = "";
        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < str.length; i++) {
            while (num >= arr[i]) {
                s = s + str[i];
                num = num - arr[i];
            }
        }
        
        return s;
    }
}