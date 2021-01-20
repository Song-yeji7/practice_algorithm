package programmers;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class sq_functiondev {

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> list_answer = new ArrayList<Integer>();

        Queue<Integer> day = new LinkedList<>();

        for(int i=0; i<progresses.length; i++){
            int tmp = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]>0)
                tmp++;

            day.add(tmp);
        }

        while(day.size()>1){
            int cnt = 1;
            int first = day.poll();
            while (first >= day.peek()) {
                cnt++;
                day.poll();
                if(day.size()==0) break;
            }
            list_answer.add(cnt);
            //System.out.println(list_answer);
        }

        if(day.size()==1)
            list_answer.add(1);

        answer = list_answer.stream().mapToInt(i->i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};//{93, 30, 55};
        int[] speeds = {1, 1, 1, 1, 1, 1};//{1, 30, 5};

        int[] result = solution(progresses, speeds);

        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+"/");
    }
}