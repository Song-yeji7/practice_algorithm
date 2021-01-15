import java.util.*;

public class hash_failplayer {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        /*
        for(int i=0; i<participant.length; i++){
            int count = 0;

            for(int j=0; j<completion.length; j++){
                if(participant[i].equals(completion[j]))
                    count++;
            }
            System.out.println(participant[i]+"/"+count);

            if(count==0) {
                answer = participant[i];
                break;
            }
        }
         */


        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }
        if(answer.equals(""))
            answer = participant[participant.length-1];

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};//{"leo", "kiki", "eden"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};//{"eden", "kiki"};

        String answer = solution(participant, completion);

        System.out.println(answer);
    }
}
