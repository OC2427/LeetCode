class Solution {
    public boolean isPalindrome(int x) {
        int y = x, num = 0;
        while (y > 0){
            num = (num * 10) + (y % 10);
            y = (y - (y % 10)) / 10;
        }
        if (num == x) return true;
        else return false;
    }
}