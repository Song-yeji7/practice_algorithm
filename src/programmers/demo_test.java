package programmers;

public class demo_test {
    //내가 푼 답안. 정확성 100 효율성 0
    public static int[] solution01(int[][] v) {
        int[] answer = new int[2];

        //x구하기
        if(v[0][0] == v[1][0])
            answer[0] = v[2][0];
        else if(v[0][0] == v[2][0])
            answer[0] = v[1][0];
        else if(v[1][0] == v[2][0])
            answer[0] = v[0][0];

        //y구하기
        if(v[0][1] == v[1][1])
            answer[1] = v[2][1];
        else if(v[0][1] == v[2][1])
            answer[1] = v[1][1];
        else if(v[1][1] == v[2][1])
            answer[1] = v[0][1];

        return answer;
    }

    //인터넷 참고. 정확성 100 효율성 0
    /*
        A xor A = 0
        A xor A xor B = B를 이용하면 다른 값 1개를 쉽게 구할 수 있다.
        0 xor B = B
        같은 값 xor은 0이 나오고 0이랑 xor하면 나머지 한 값이 나오게 된다. (xor = or의 반대)
    */
    public static int[] solution02(int[][] v) {
        int[] answer = new int[2];

        for(int i=0;i<3;i++){
            answer[0] ^= v[i][0];
            answer[1] ^= v[i][1];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] value = new int[3][2];
        int[] result = new int[2];

        value[0][0] = 1;
        value[0][1] = 4;
        value[1][0] = 3;
        value[1][1] = 4;
        value[2][0] = 3;
        value[2][1] = 10;

        result = solution01(value);
        System.out.println("solution01 : "+result[0]+", "+result[1]);

        value[0][0] = 1;
        value[0][1] = 1;
        value[1][0] = 2;
        value[1][1] = 2;
        value[2][0] = 1;
        value[2][1] = 2;

        result = solution02(value);
        System.out.println("solution02 : "+result[0]+", "+result[1]);

    }
}
