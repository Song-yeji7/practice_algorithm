package programmers;

import java.util.*;

public class kakao_blind_2022_01 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        /*
        *고민1
        *- HashMap<String, String>을 이용하려 해결하려 하였으나 1명의 이용자가 2명 이상을 신고하고자 할 때 문제가 됨

        HashMap<String, String> hm_id = new HashMap<String,String>();
        for(String key : report) {
            String[] skey = key.split(" ");
            hm_id.put(skey[0], hm_id.getOrDefault(skey[0], skey[1]));
            //System.out.println(hm_id);
        }

        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        for (String key_cnt : hm_id.values()) {
            int value = counts.get(key_cnt) == null ? 0 : counts.get(key_cnt);
            counts.put(key_cnt, value + 1);
        }
        //System.out.println(counts);

        int cnt = 0;
        for(String id : id_list){
            System.out.println(counts.get(id));
            answer[cnt] = counts.get(id) == null ? 0 : counts.get(id);
            cnt++;
        }

        for (int i : answer)
            System.out.print(answer[i]+"\t");
        */

        /*
        *고민2
        *- 저장 순서대로 HashMap에 저장하기 위해 HashMap이 아 LinkedHashMap을 사용
        *- 유저 별 ID 중복 신고를 방지하기 위해 HashSet을 이용하여 중복 ID 정리
        *- 각 유저와 신고한 ID를 <String, HashSet<String>> 형태의 LinkedHashMap으로 저장
        *- 반복문을 통해 신고된 아이디 별로 신고 횟수를 카운드
        *- 반복문을 통해 각 유저가 신고한 ID 중 정지된 ID의 갯수를 카운트
        *- 더 좋은 방안이 있을 것 같음,, */
        Map<String, HashSet<String>> hm_id = new LinkedHashMap<>();
        Map<String, Integer> hm_report = new HashMap<>();
        for(String key_id : id_list) {
            hm_id.put(key_id, new HashSet<String>());
            hm_report.put(key_id, 0);
            //System.out.println(":::"+hm_id);
        }

        for(String key : report){
            String[] skey = key.split(" ");
            hm_id.get(skey[0]).add(skey[1]);
        }

        for(String key_id : hm_id.keySet()){
            //System.out.println(key_id);
            for(String key_re : hm_id.get(key_id)) {
                //System.out.println("::" + key_re);
                hm_report.replace(key_re, hm_report.get(key_re)+1);
                //System.out.println("::" + hm_report.get(key_re));
            }
            //System.out.println("::"+hm_id.get(key_id).toString());
        }

        int cnt = 0;
        for(String key_id : hm_id.keySet()){
            answer[cnt] = 0;
            for(String key_re : hm_id.get(key_id)) {
                if(hm_report.get(key_re) >= k) answer[cnt] += 1;
            }
            //System.out.println(answer[cnt]);
            cnt++;
        }
        //System.out.println(hm_id);

        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        //String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;


        int[] result = solution(id_list, report, k);

        //System.out.println(result);
    }
}
