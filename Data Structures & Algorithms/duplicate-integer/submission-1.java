class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> countKaro= new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if (countKaro.contains(nums[i])){
              return true;
           }
            countKaro.add(nums[i]);
        }
        return false;
    }
}