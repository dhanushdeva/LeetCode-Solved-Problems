import java.util.StringTokenizer;
class Solution {
    public int countSegments(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int word=0;
        while(st.hasMoreTokens()){
            word++;
            st.nextToken();
        }
        return word;
    }
}