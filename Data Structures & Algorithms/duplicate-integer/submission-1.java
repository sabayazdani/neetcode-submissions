class Solution {
    /*
    HashSet
    Time complexity : o(n)
    Space Complexity : o(n)
    */
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>(); 
        for ( int num: nums) {
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}