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

public class Easy_SubarrayDivision {


    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        for(int i = 0; i<=s.size()-m; i++){
            int tmp = 0;

            for(int j = 0; j<m; j++)
                tmp += s.get(i+j);

            if(tmp==d) result++;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        /*

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

         */

        //List<Integer> s = Stream.of("1 1 1 1 1".split(" ")).map(Integer::parseInt).collect(toList());
        //int d = 3;
        //int m = 2;

        List<Integer> s = Stream.of("4".split(" ")).map(Integer::parseInt).collect(toList());
        int d = 4;
        int m = 1;


        int result = birthday(s, d, m);
        System.out.println(result);
    }

}
