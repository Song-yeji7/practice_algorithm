package codility;

import java.util.*;

public class lesson2_odd {

    public static int solution(int[] A) {
        Arrays.sort(A);

        int tmp = A[0];
        int result = tmp;
        int cnt = 1;

        System.out.println(tmp+","+A[0]+","+cnt);
        for(int i = 1; i<A.length; i++){
            if(tmp == A[i])
                cnt++;
            else {
                if(cnt%2 != 0){
                    result = tmp;
                    break;
                }
                tmp = A[i];
                cnt = 1;
            }
            System.out.println(tmp+","+A[i]+","+cnt);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] N = {2,2,3,3,4};

        int result = solution(N);
        System.out.println(result);
    }
}
