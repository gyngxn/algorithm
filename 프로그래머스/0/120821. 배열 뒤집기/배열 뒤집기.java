class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int num;
        
        for(int i = 0; i < num_list.length; i++) {
            num = num_list.length - (i+1);
            answer[i] = num_list[num];
        }
        return answer;
    }
}