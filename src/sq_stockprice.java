import java.util.Stack;
public class sq_stockprice {

    public static int[] solution(int[] prices) {
        int plength = prices.length;
        int[] answer = new int[plength];

        for (int i=0; i<plength; i++){
            int cnt = 0;//기준값

            for(int j=i+1; j<plength; j++) {
                cnt++;
                if(prices[i]>prices[j]) break;
            }

            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};

        int[] result = solution(prices);

        for(int i=0;i<result.length;i++)
            System.out.println(result[i]);
    }
}