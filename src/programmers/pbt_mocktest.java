package programmers;

import java.util.*;

public class pbt_mocktest {
    public static int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> list_answer = new ArrayList<Integer>();
        int max = 0;
        int cnt01 = 0, cnt02 = 0, cnt03 = 0;

        /*
        * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
        * */
        int[] student01 = {1,2,3,4,5};
        int[] student02 = {2,1,2,3,2,4,2,5};
        int[] student03 = {3,3,1,1,2,2,4,4,5,5};

        for(int j=0; j<answers.length; j++) {
            if (answers[j] == student01[j % 5]) cnt01++;
            if (answers[j] == student02[j % 8]) cnt02++;
            if (answers[j] == student03[j % 10]) cnt03++;
        }

        max = Math.max(Math.max(cnt01,cnt02),cnt03);

        if(max==cnt01) list_answer.add(1);
        if(max==cnt02) list_answer.add(2);
        if(max==cnt03) list_answer.add(3);

        answer = list_answer.stream().mapToInt(i->i).toArray();


        return answer;

        /*for(int i=0; i<3; i++){
            int cnt = 0;
            for(int j=0; j<answers.length; j++) {
                if(answers[j]==student[i][j%student[i].length])
                    cnt++;
            }

            temp_answer.put(i, cnt);
        }

        List<Integer> temp = new ArrayList<>(temp_answer.keySet());

        Collections.sort(temp, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return temp_answer.get(o2).compareTo(temp_answer.get(o1));
            }
        });

        list_answer.add(1);

        for(int i = 1; i<temp_answer.size(); i++) {
            if (temp_answer.get(0) != temp_answer.get(i))
                break;
            else
                list_answer.add(i + 1);
        }

        //반환 변수로 변경
        answer = list_answer.stream().mapToInt(i->i).toArray();
        */
    }

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        int[] answer = solution(answers);

        for(int i=0; i<answer.length; i++)
            System.out.print(answer[i]+"/");
    }
}
