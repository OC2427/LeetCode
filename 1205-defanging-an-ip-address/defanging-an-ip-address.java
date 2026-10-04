class Solution {
    public String defangIPaddr(String address) {
        String[] arr = address.split("\\.");
        String ans = String.join("[.]", arr);
        return ans;
    }
}