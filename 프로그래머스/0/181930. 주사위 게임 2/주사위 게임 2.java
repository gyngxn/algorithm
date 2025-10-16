class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int case1 = a + b + c;
        int case2 = a*a + b*b + c*c;
        int case3 = a*a*a + b*b*b + c*c*c;
        
        if (a == b && b == c && c == a) {
            return case1 * case2 * case3;
        } else if (a == b || b == c || c == a) {
            return case1 * case2;
        } else {
            return case1;
        }
    }
}