import java.util.*;

public class pbt_primenumber {
    public static HashSet<Integer> hs_list= new HashSet<Integer>();

    public static int solution(String numbers) {
        int answer = 0;
        int chk = 0;
        List<String> ls_number = new ArrayList<String>();
        String[] ar_number = {};

        ls_number = Arrays.asList(numbers.split(""));
        ar_number = ls_number.toArray(new String[0]);

        for(int i=0; i<ar_number.length+1; i++) {
            perm(ar_number, 0, ar_number.length, i);
        }

        Iterator<Integer> it = hs_list.iterator();

        while (it.hasNext()) { // hasNext() : 데이터가 있으면 true 없으면 false
            boolean ls_bool = true;
            chk = it.next();

            if(chk>1) {
                for (int i = 2; i < chk; i++) {
                    if (chk % i == 0) {
                        ls_bool = false;
                        break;
                    }
                }

                if(ls_bool == true) {
                    System.out.println(chk);
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void perm(String[] arr, int depth, int n, int k) {
        if (depth == k) { // 한번 depth 가 k로 도달하면 사이클이 돌았음. 출력함.

            String number = "";
            for (int i = 0; i < k; i++) {
                number += arr[i];
            }
            if(number!="") {
                hs_list.add(Integer.parseInt(number));
            }
            return;
        }
        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, k);
            swap(arr, i, depth);
        }
    }


    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int result = solution("17");

        System.out.println(result);
    }
}
