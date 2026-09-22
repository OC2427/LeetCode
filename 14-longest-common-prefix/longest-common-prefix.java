class Solution {
    public String longestCommonPrefix(String[] strs) {
        int a = strs[0].length(), len;
        for (int j = 1; j < strs.length; j++){
            if (strs[j-1].length() > strs[j].length()) len = strs[j].length();
            else len = strs[j-1].length();
            if (a < len) len = a;
            int b = 0;
            for (int k = 0; k < len; k++){
                if (strs[0].charAt(k) != strs[j].charAt(k)) break;
                b++;
            }
            if (a > b) a = b;
        }
        String s = "";
        for (int i = 0; i < a; i++){
            s = s + strs[0].charAt(i);
        }
        if (strs.length == 1) s = strs[0];
        return s;
    }
}