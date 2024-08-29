class Solution {
    public String toGoatLatin(String sentence) {
        HashSet<Character> vowels = new HashSet();
        for(char c : "aeiouAEIOU".toCharArray()){
            vowels.add(c);
        }

        String result = "";
        int index = 1;
        for(String word : sentence.split("\\s")){
            if(index > 1){
                result += " ";
            }

            char letter = word.charAt(0);
            if(vowels.contains(letter)){
                result += word + "ma";
            }else {
                result += word.substring(1) + letter + "ma";
            }

            for(int j=0; j<index; j++){
                result += "a";
            }

            index += 1;
        }

        return result;
    }
}