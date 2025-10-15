/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       Queue<TreeNode> qu = new LinkedList<>();
       List<List<Integer>> ans = new ArrayList<>();
       if(root==null) return ans;
       qu.add(root);
       int cnt = 0;
       while(!qu.isEmpty()){
        int sz = qu.size();
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<sz;i++){
            TreeNode x = qu.poll();
            ls.add(x.val);
            if(x.left!=null) qu.add(x.left);
            if(x.right!=null) qu.add(x.right);
        }
        ans.add(ls);
       }
       int i=0;
       for(List<Integer> k:ans){
        
        if(i%2!=0){
            Collections.reverse(k);
        }
        i++;
       }
       return ans;
    }
}