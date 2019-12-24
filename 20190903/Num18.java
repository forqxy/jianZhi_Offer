/**
 * Created by hsl on 2019-12-24
 * Time:星期二  23:25
 * desc:<树>
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 *           8                8
 *     	   /  \             /  \
 *     	  6   10           10   6
 *     	 / \  / \         / \  / \
 *     	5  7 9 11        11 9 7  5
 */
public class Num18 {
    public void mirror(TreeNode root){
        if(root == null || root.left == null || root.right == null){
            return;
        }
        TreeNode treeNode = root.left;
        root.left = root.right;
        root.right = treeNode;
        if(root.left!= null){
            mirror(root.left);
        }
        if(root.right != null){
            mirror(root.right);
        }
    }
}
