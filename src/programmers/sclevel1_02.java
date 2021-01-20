package programmers;//import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

public class sclevel1_02 {

    public static long solution(long n) {
        long result = 0;
        double sqrt_n = Math.sqrt(n);

        if(n==(long)Math.pow(sqrt_n,2))
            result = (long) Math.pow(sqrt_n+1, 2);
        else result = -1;

        return result;
    }

    public static void main(String[] args) {
        long n = 121;

        long result = solution(n);

        System.out.println(result);
    }
}
