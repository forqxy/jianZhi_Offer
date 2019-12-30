import java.util.ArrayList;
import java.util.List;

/**
 * Created by hsl on 2019-12-30
 * Time:星期一  23:10
 * desc:<一句话简述功能>
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Num24 {
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target){
        if(root == null){
            return resultList;
        }
        list.add(root.val);
        target-=root.val;
        if(target == 0 && root.left == null && root.right == null){
            //new新对象,不然所指地址同一个
            resultList.add(new ArrayList<>(list));
        }
        findPath(root.left,target);
        findPath(root.right,target);
        //不符合移除返回到父节点
        list.remove(list.size()-1);
        return resultList;
    }
}
