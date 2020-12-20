package maintree;



public class main {
    private int minSum;
    private treedama minRoot;

    public treedama findSubTree(treedama root){
        minSum = Integer.MAX_VALUE;
        minRoot = null;
        getSum(root);
        return minRoot;
    }

    private int getSum(treedama root){
        if(root == null){
            return 0;
        }

        int sum = getSum(root.left) + getSum(root.right) + root.wa;
        if(sum < minSum){
            minSum = sum;
            minRoot = root;
        }

        return sum;
    }
}
