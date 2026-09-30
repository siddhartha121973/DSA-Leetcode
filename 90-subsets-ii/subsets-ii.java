class Solution {
    static void solve(int[] nums, List<List<Integer>>output, List<Integer>temp , int i ){
        if(i >= nums.length){
            output.add(new ArrayList<>(temp) );
            return;
        }
        // include kar raha hu;
        temp.add(nums[i]);
        solve(nums , output , temp , i+1);
        //bactracking step
        // last wala jo include jua hai uso hata raha hu
        temp.remove(temp.size()-1);

        //hame same element ko ignore karte hu new wala element lena hai
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }

        // now exclude i call mar do
        solve(nums , output , temp , i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>output=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int i=0;
        solve(nums , output , temp ,i);
        return output;
    }
}
 