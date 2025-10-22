import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        List<String> answerList = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                answerList.add(strArr[i]);
            }
        }
        
        String[] answer = new String[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}