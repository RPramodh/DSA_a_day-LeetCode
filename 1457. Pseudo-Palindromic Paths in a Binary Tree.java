class Solution {
    int count=0;
    public int pseudoPalindromicPaths (TreeNode root) {
            Set<Integer> node=new HashSet<>();
            solver(node,root);
            return count;
    }

    public void solver(Set<Integer> node,TreeNode root)
    {
        if(root==null) return;
        if(node.contains(root.val))
        {
            node.remove(root.val);
        }
        else
        {
            node.add(root.val);
        }

        if(root.left==null && root.right==null)
        {
            if(node.size()==0||node.size()==1)
            {
                count++;
            }
        }

        solver(new HashSet(node),root.left);
        solver(new HashSet(node),root.right);
    }
}
