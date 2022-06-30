package 三十九;
import java.util.*;

public class Solution {

    private List<List<Integer>> result = new ArrayList();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, new ArrayList<>(), 0,0);

        return result;
    }

    private void dfs(int[] candidates, int target,List<Integer>path,int pathSum,int startIndex){

        if (pathSum == target) {
            result.add(new ArrayList(path));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            //只有当路径和小于目标时才有必要遍历
            if (pathSum + candidates[i] <= target) {
                path.add(candidates[i]);
                dfs(candidates, target, path, pathSum + candidates[i], i);
                //每次遍历移除上次加入的路径
                path.remove(path.size()-1);
            }
        }
    }
}
