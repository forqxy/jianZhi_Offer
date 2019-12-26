import java.util.ArrayList;
import java.util.List;

/**
 * Created by hsl on 2019-12-26
 * Time:星期四  23:14
 * desc:<队列,树>
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 其实就是二叉树的层序遍历,BFS广度优先搜索算法
 */
public class Num22 {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();
        if(root == null){
            return arr;
        }
        nodeList.add(root);
        while (nodeList.size() != 0){
            TreeNode treeNode = nodeList.remove(0);
            if(treeNode.left != null){
                nodeList.add(treeNode.left);
            }
            if(treeNode.right != null){
                nodeList.add(treeNode.right);
            }
            arr.add(treeNode.val);
        }
        return arr;
    }
}
