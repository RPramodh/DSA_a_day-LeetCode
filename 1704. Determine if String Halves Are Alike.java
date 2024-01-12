class Solution {
    public boolean halvesAreAlike(String s) {
        String a="";
        String b="";
        int slen=s.length();
        int alen=slen/2;
        for(int i=0;i<alen;i++)
        {
            a=a+s.charAt(i);
        }
        for(int i=alen;i<slen;i++)
        {
            b=b+s.charAt(i);
        }
        return helper(a)==helper(b);


    }

    private int helper(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert to lowercase to make the comparison case-insensitive

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}
