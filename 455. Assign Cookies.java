class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,count=0;
        while(j<s.length && i<g.length && count<g.length)
        {
            if(g[i]<=s[j])
            {
                i++;
                j++;
                count++;
            }
            else
            {
                j++;
            }
        }


        return count;
    }
}
