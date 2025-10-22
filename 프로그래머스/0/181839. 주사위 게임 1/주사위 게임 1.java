class Solution {
    public int solution(int a, int b) {
        int case1 = a*a + b*b;
        int case2 = 2 * (a + b);
        int case3 = Math.abs(a-b);
        
        if(a % 2 == 1 && b % 2 == 1) {
            return case1;
        } else if(a % 2 == 1 || b % 2 == 1) {
            return case2;
        } else {
            return case3;
        }
    }
}