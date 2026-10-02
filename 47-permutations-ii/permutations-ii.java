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
            while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);

        boolean[] visited = new boolean[nums.length];

        solve(nums, output, temp, visited);

        return output;
    }
}
