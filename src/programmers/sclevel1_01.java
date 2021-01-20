package programmers;//import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

public class sclevel1_01 {

    public static int[] solution(int[] arr) {
        int[] result = {};
        List<Integer> temp = new ArrayList<Integer>();

        if(arr.length == 1) {
            temp.add(-1);
        } else {
            int min = arr[0];

            for(int i = 1; i<arr.length; i++){
                if(min>arr[i]) min = arr[i];
            }

            for(int j = 0; j<arr.length; j++) {
                if(arr[j]!=min) temp.add(arr[j]);
            }
        }

        result = temp.stream().mapToInt(i->i).toArray();

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};

        int[] result = solution(arr);
        for(int i = 0; i<result.length; i++)
            System.out.println(result[i]);
    }
}
