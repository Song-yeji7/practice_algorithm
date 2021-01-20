package programmers;

import java.util.*;

public class sort_hindex {
    public static int solution(int[] citations) {
        int answer = 0;
        Integer[] temp = new Integer[citations.length];
        temp = Arrays.stream(citations).boxed().toArray(Integer[]::new);//int[] to Integer[]
        //citations = Arrays.stream(temp).mapToInt(Integer::intValue).toArray();//Integer[] to int[]

        Arrays.sort(temp, Comparator.reverseOrder());

        for(int i=0;i<temp.length;i++){
            if(i+1==temp[i]){
                answer = i+1;
                break;
            } else if (i+1>temp[i]){
                answer = i;
                break;
            }

            if(i==temp.length-1 && temp[i]!=0){ //전부 0이 아닌데 끝까지 반복문이 실행된 경우
                answer=temp.length;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {25,5,8,3,3};//{10,8,5,4,3};//{3,0,6,1,5};

        int answer = solution(citations);
        System.out.println(answer);
    }
}
