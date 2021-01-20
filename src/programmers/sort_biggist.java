package programmers;

import javax.crypto.spec.PSource;
import java.util.*;

public class sort_biggist {

    public static String solution(int[] numbers){
        String answer = "";

        /*
        // 답 아님 ㅠㅠ 30,3이 330이 되어야하는데 303이 되어버림..

        String[] temp = new String[numbers.length];

        //1000 이하 int형 숫자 String으로 변환하여 배열에 담기
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]>1000) return "1000 이상";
            temp[i] = String.valueOf(numbers[i]);
        }

        //문자열 내림차순 정렬
        Arrays.sort(temp, Collections.reverseOrder());

        for(int i=0;i<temp.length;i++){
            answer += temp[i];
        }
        */

        String[] temp = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]>1000) return "1000 이상";
            temp[i] = String.valueOf(numbers[i]);
        }

        //compare의 o1과 o2는 어떻게 기준이 잡힐까.. 어렵다잉
        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for(int i=0;i<temp.length;i++){
            if(i==0 && temp[i].equals("0")) {
                answer = "0";
                break;
            }
            answer += temp[i];
        }



        return answer;
    }

    public static void main(String[] args) {
        String result = "";
        int[] numbers = {30, 3, 34, 9, 5};

        result = solution(numbers);

        System.out.printf("solution01 : "+result);
    }
}
