class Solution {
    int MaxDiff;
    public int maxAncestorDiff(TreeNode root) {
        MaxDiff=0;
        if(root==null) return MaxDiff;
        helper(root,root.val,root.val);
        return MaxDiff;
    }
    public void helper(TreeNode root,int Currmax, int Currmin)
    {
        if(root!=null)
        {
            int CurrDiff=Math.max(Math.abs(root.val-Currmax),Math.abs(root.val-Currmin));
            MaxDiff=Math.max(MaxDiff,CurrDiff);
            Currmax=Math.max(root.val,Currmax);
            Currmin=Math.min(root.val,Currmin);
            helper(root.left,Currmax,Currmin);
            helper(root.right,Currmax,Currmin);
        }
    }
}
