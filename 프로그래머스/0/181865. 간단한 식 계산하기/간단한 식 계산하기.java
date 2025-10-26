class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        
        String op = str[1];
        
        switch(op) {
            case "+":
                answer = a + b;
                break;
            
            case "-":
                answer = a - b;
                break;
            
            case "*":
                answer = a * b;
                break;
        }
    
        return answer;
    }
}