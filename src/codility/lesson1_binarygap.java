package codility;

public class lesson1_binarygap {

    public static int solution(int N) {
        String binaryStr = Integer.toBinaryString(N);
        String[] arrStr = binaryStr.split("");
        int count = 0;
        int max_count = 0;

        for(int i = 1; i<arrStr.length; i++){
            if(arrStr[i].equals("0"))
                count++;
            else{
                if(max_count < count)
                    max_count = count;
                count = 0;
            }
        }

        return max_count;
    }

    public static void main(String[] args) {
        int N = 561892;

        int result = solution(N);
        System.out.println(result);
    }
}
