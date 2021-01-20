package programmers;

import java.util.HashMap;

public class hash_spy {
    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hm_clothes = new HashMap<String,Integer>();

        for(int i = 0; i<clothes.length; i++){
            String key = clothes[i][1];
            hm_clothes.put(key, hm_clothes.getOrDefault(key,1)+1);
        }

        for (int value : hm_clothes.values()){
            answer *= value;
        }

        answer--;//모두 0인 경우 제외

       return answer;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        int answer = solution(clothes);
        System.out.println(answer);

    }
}
