class Solution {
    public int reverseDegree(String s) {
        int sum = 0, count = 1;
        while(count != (s.length() + 1)){
            int ch = (int)(s.charAt(count - 1));
            sum += ((123 - ch) * count);
            count++;
        }
        return sum;
    }
}