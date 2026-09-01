class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x = 0; 
        int v = -1; 
        int[] result = new int[2]; 
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for ( int i = 0 ; i < nums.length ; i++) {
            hash.put(nums[i] , i);
        }
        for ( int i = 0 ; i < nums.length ; i++){
            x = target - nums[i];
            v = hash.getOrDefault(x , -1);
            if(v != -1 && i!=v) {
                if(v >i) {
                result[1] = v ; 
                result[0] = i;
                }
                else{
                    result[1] = i ; 
                result[0] = v; 
                }

                
            }
            
        }
        return result;
    }
}
