class Solution {
    public boolean isAnagram(String str, String tr) {
        int[] freq = new int[26];
        char[] s = str.toCharArray();
        char[] t = tr.toCharArray();
        for(char c : s)
        {
            freq[c-'a']++;
        }

        for(char c : t)
        {
            freq[c-'a']--;
            if(freq[c-'a']<0)
            return false;
        }

        for(int i = 0; i<26; i++)
        {
            if(freq[i]!=0)
            return false;
        }
        return true;
    }
}