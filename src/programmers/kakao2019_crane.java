package programmers;

import java.util.*;

public class kakao2019_crane {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<Integer>();

        for (int i = 0; i < moves.length; i++) {
            int m = moves[i] - 1;

            for (int j = 0; j < board.length; j++)
                if (board[j][m] != 0) {
                    if (!basket.isEmpty() && basket.get(basket.size() - 1) == board[j][m]) {
                        basket.remove(basket.size() - 1);
                        answer += 2;
                    } else {
                        basket.add(board[j][m]);
                    }

                    board[j][m] = 0;
                    break;
                }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int answer = solution(board, moves);
        System.out.println("solution : "+answer);
    }
}
