class Solution {
    /*
        Brute Force
        Time complexity: o(nlogn) + o(mlogm)
        Space Complexity : o(1)
    */

    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        char[] c1 = s.toCharArray(); // o(n)
        char[] c2 = t.toCharArray(); // o(n)
        Arrays.sort(c1); // o(nlong)
        Arrays.sort(c2); // o(nlogn)
        return Arrays.equals(c1,c2); //o(n)
    }
}
