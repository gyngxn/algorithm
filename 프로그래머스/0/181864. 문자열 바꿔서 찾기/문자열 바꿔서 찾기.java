class Solution {
    public int solution(String myString, String pat) {
        String result = myString.replace("A", "C").replace("B", "A").replace("C", "B");
        
        if(result.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}