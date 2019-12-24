/**
 * Created by hsl on 2019-12-24
 * Time:星期二  22:14
 * desc:<二叉树>
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 */
public class Num17 {
    public boolean hasSubtree(TreeNode root1,TreeNode root2){
        boolean result = false;
        if(root1 != null &&root2 != null){
            if(root1.val == root2.val){
                result = tree1HasTree2(root1,root2);
            }
            //左儿子判断
            if(!result){
                result = tree1HasTree2(root1.left,root2);
            }
            //右儿子
            if(!result){
                result = tree1HasTree2(root1.right,root2);
            }
        }
        return result;
    }

    public static boolean tree1HasTree2(TreeNode root1,TreeNode root2){
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        //如果根节点对应的上，那么就分别去子节点里面匹配
        return tree1HasTree2(root1.left,root2.left) && tree1HasTree2(root1.right,root2.right);
    }

}
