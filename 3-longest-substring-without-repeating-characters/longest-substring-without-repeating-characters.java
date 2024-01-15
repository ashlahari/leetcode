class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> sSet = new HashSet<>();
        int max = 0, count = 0, pos = 0;
        for(int i = 0; i < s.length(); i++) {
            if(!sSet.contains(s.charAt(i))) {
                count++;
            }
            else {
                max = Math.max(max, count);
                count = 1;
                sSet.clear();
                pos++;
                i = pos;
            }
            sSet.add(s.charAt(i));
        }
        return max > count ? max : count;
    }
}