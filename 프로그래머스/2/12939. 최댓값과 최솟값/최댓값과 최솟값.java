class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);
        
        for(int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }
        return min + " " + max;
    }
}