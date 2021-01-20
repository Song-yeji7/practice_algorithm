package programmers;

import java.util.Arrays;

public class hash_phonelist {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i = 0; i<phone_book.length; i++){
            for(int j = 0; j<phone_book.length; j++){
                if(i==j) continue;
                //if(phone_book[j].contains(phone_book[i])) {
                if(phone_book[j].startsWith(phone_book[i])){
                    return false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};//{"123","456","789"};
        boolean answer = solution(phone_book);

        System.out.println(answer);
    }
}
