package hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Easy_BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int alcm = a.get(0);
        int bgcd = b.get(0);
        int result = 0;

        for(int i=1;i<a.size();i++) {
            alcm =lcm(alcm, a.get(i));
        }

        for(int j=1;j<b.size();j++) {
            bgcd =gcd(bgcd, b.get(j));
        }

        for(int k=alcm; k<=bgcd; k+=alcm){
            if(bgcd%k==0) result++;
        }

        return result;
    }

    static int gcd(int a, int b){//최대공약수
        if (a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }

    static int lcm(int a, int b){//최소공배수
        return a * b / gcd(a,b);
    }

    public static void main(String[] args) throws IOException {
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
         */


        List<Integer> arr = Stream.of("2 4".split(" ")).map(Integer::parseInt).collect(toList());

        List<Integer> brr = Stream.of("16 32 96".split(" ")).map(Integer::parseInt).collect(toList());

        int total = getTotalX(arr, brr);

        System.out.println(total);
    }

}
