package pro;

import java.util.ArrayList;

public class preder {
    public ArrayList<Integer> preorderTraversal(treeda root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }

        ArrayList<Integer> left = preorderTraversal(root.left);
        ArrayList<Integer> right = preorderTraversal(root.right);

        result.add(root.wa);
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}
