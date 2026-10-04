class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> L = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0) L.add("FizzBuzz");
            else if (i % 3 == 0) L.add("Fizz");
            else if (i % 5 == 0) L.add("Buzz");
            else L.add(Integer.toString(i));
        }
        return L;
    }
}