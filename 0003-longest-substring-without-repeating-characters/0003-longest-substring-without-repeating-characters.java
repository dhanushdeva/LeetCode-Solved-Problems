class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
      int l = 0;
      int max = 0;
      HashSet<Character> set = new HashSet<>();
      for(int i = 0;i < n;i++)
      {
        if(!set.contains(s.charAt(i)))
        {
            set.add(s.charAt(i));
            max = Math.max(max,i+1-l);
        }
        else
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
        }
      }
      return max;
    }
}