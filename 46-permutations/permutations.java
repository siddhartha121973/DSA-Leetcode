class Solution {

    static void solve(int[] nums,List<List<Integer>> output,List<Integer> temp, boolean[] visited) {   // permutation complete
        if (temp.size() == nums.length) {
            output.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // already used
            if (visited[i]) {
                continue;
            }

            // choose
            visited[i] = true;
            temp.add(nums[i]);

            // explore
            solve(nums, output, temp, visited);

            // backtrack
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];

        solve(nums, output, temp, visited);

        return output;
    }
}