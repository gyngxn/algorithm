import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> answerList = new ArrayList<>();
        
        for(long i = 1; i <= n; i++) {
            answerList.add(x*i);
        }
        
        long[] answer = new long[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}