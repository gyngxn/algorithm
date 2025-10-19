import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
       
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            answerList.add(arr[i]);
        }
        
        for(int i = 0; i < delete_list.length; i++) {
            answerList.remove(Integer.valueOf(delete_list[i]));
        }
        
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}