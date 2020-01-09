/**
 * Created by hsl on 2020-01-09
 * Time:星期四  23:10
 * desc:<二叉树的深度>
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）
 * 形成树的一条路径，最长路径的长度为树的深度。
 */
public class Num36 {
    //看到二叉树就自然先想到递归
    public int TreeDepth(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
        }
    }
}
