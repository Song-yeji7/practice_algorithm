import java.util.Arrays;

public class sort_k {

    //내가 푼 답안. 정확도 100
    public static int[] solution01(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int[] temp = new int[commands[i][1]-commands[i][0]+1];
            int cnt = 0;

            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                temp[cnt++] = array[j];
            }
            Arrays.sort(temp);

            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    //인터넷 답안. 정확도 100
    /*
    * 코딩테스트라서 메소드를 모두 구현해야하는 줄 알았는데 메소드를 사용해도 되는구나..!
    * 메소드를 잘 활용하자
    */
   public static int[] solution02(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);

            Arrays.sort(temp);

            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer01, answer02;

        //solution01
        String txt_result01 = "solution01 : ";

        answer01 = solution01(array, commands);

        for(int i = 0; i < answer01.length; i++)
            txt_result01 += "\t"+answer01[i];
        System.out.println(txt_result01);

        //solution02
        String txt_result02 = "solution02 : ";

        answer02 = solution01(array, commands);

        for(int i = 0; i < answer02.length; i++)
            txt_result02 += "\t"+answer02[i];
        System.out.println(txt_result02);
    }
}
