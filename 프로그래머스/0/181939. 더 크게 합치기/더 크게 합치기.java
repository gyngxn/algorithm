class Solution {
    public int solution(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        int case1 = Integer.parseInt(str1 + str2);
        int case2 = Integer.parseInt(str2 + str1);
        
        if(case1 >= case2) {
            return case1;
        } else {
            return case2;
        }
    }
}