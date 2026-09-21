class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int value = 26 - (s.charAt(i) - 'a');
            sum = sum + value * (i+1);
        }
        return sum;
    }
}