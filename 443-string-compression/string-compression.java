class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for(int i=0; i<chars.length; i++)
        {
            if(i==chars.length-1 || chars[i]!=chars[i+1])
            {
                if(cnt == 1)
                sb.append(chars[i]);
                else
                {
                    sb.append(chars[i]);
                    sb.append(cnt);
                    cnt = 1;
                }
            }
            else if(chars[i]==chars[i+1])
            {
                cnt++;
            }
        }
        int k = 0;
        
        for(; k<sb.length(); )
        {
            char c = sb.charAt(k);
            chars[k++] = c;

        }
        return sb.length();
    }
}