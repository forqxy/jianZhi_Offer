/**
 * Created by hsl on 2020-01-09
 * Time:星期四  23:13
 * desc:<平衡二叉树>
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树.
 */
public class Num37 {
    //平衡二叉树,还是判断二叉树的深度.
    public boolean IsBalanced_Solution(TreeNode root){
        if(root == null){
            return true;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.abs(left-right) <= 1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    public int TreeDepth(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
        }
    }
}
