package tree;

import java.util.ArrayList;
import java.util.List;
public class all {



    public List<String> binaryTreePaths(treedama root){
        List<String> paths = new ArrayList<>();
        if(root == null){
            return paths;
        }

        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rightPaths = binaryTreePaths(root.right);

        for(String path : leftPaths){
            paths.add(root.val + "->" + path);
        }
        for(String path : rightPaths){
            paths.add(root.val + "->" + path);
        }

        //root is a leaf
        if(paths.size() == 0){
            paths.add("" + root.val);
        }

        return paths;
    }
}

